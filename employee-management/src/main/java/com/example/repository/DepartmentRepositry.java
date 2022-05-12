package com.example.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.example.domain.Department;

@Repository
public class DepartmentRepositry {
	@Autowired
	private NamedParameterJdbcTemplate template;
	private static final RowMapper<Department> DEPARTMENT_ROW_MAPPER = (rs, i) -> { //sqlから返ってきた結果
		System.out.println("MAPPERが呼び出されました");
		Department department = new Department();
		department.setName(rs.getString("name"));
		department.setId(rs.getInt("department_id")); //ここでdepartment_idにしているため結果をこの型にしなければいけない、呼び出しの分を変更する必要があり
		return department;
	};

	// 1番最初にSELECT句を書いてきちんと呼び出せるかを確認
	public Department load(Integer aaa) {
		System.out.println("Repositoryのload()が呼ばれました");
		String sql = "select id, name from departments where id = :id";
		// ここでasを使って名前を編集可能、最後の「:id」でx番目のidを取得、この「id = :id」はmapのキーと合わせないとダメ
		SqlParameterSource param = new MapSqlParameterSource().addValue("id", aaa);// (key,value)valueは自分で決めてokだけど引数と合わせる
		Department department = template.queryForObject(sql, param, DEPARTMENT_ROW_MAPPER);
		return department;
	}

	public List<Department> findAll() {
		System.out.println("RepositoryのfindAll()が呼ばれました");
		String sql = "select id, name from departments order by id";
		List<Department> depart = template.query(sql, DEPARTMENT_ROW_MAPPER);
		return depart;
	}

	public Department save(Department department) { //resultSetに返す必要がないためdepartment_idにしなくて良い
		System.out.println("Repositoryのsave()が呼ばれました");
		SqlParameterSource param = new BeanPropertySqlParameterSource(department);
		if(department.getId() == null) {
			String insertSql = "insert into departments(id, name) values(:id,:name)";
			template.update(insertSql, param);
		}else {
			String updateSql = "update departments set id =:id, name =:name where id =:id";
			template.update(updateSql, param);
		}
		return department;
	}

	public void deleteById(Integer departmentId) {
		System.out.println("RepositoryのdeleteById()が呼ばれました");
		String deleteSql = "delete from departments where id = :id";
		SqlParameterSource param = new MapSqlParameterSource().addValue("id", departmentId);
		template.update(deleteSql, param);
	}

}
