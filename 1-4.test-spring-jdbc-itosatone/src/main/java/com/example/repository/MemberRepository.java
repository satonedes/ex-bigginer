package com.example.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.example.domain.Member;

/**
 * membersテーブルを操作するリポジトリ.
 * 
 * @author igamasayuki
 *
 */
@Repository
public class MemberRepository {

	@Autowired
	private NamedParameterJdbcTemplate template;

	/**
	 * Memberオブジェクトを生成するローマッパー.
	 */
	private static final RowMapper<Member> MEMBER_ROW_MAPPER = (rs, i) -> {
		Member aaa = new Member();
		aaa.setId(rs.getInt("id"));
		aaa.setName(rs.getString("name"));
		aaa.setAge(rs.getInt("age"));
		aaa.setDep_id(rs.getInt("dep_id"));

		return aaa;
	};

	/**
	 * メンバー一覧情報を年齢順で取得します.
	 * 
	 * @return 全メンバー一覧 メンバーが存在しない場合はサイズ0件のメンバー一覧を返します
	 */
	public List<Member> findAll() {
		System.out.println("findAll()を実行しました");
		String sql = "select id, name, age, dep_id from test_members order by age desc";

		List<Member> memberList = template.query(sql, MEMBER_ROW_MAPPER); // ←ここに実行の処理を書く
		
		System.out.println(memberList.toString());
		return memberList;
	}

	/**
	 * 主キー検索を行います.
	 * 
	 * @param id 検索したい主キーの値
	 * @return メンバー情報(検索されなかった場合は非検査例外が発生します)
	 */
	public Member load(Integer id) {
		System.out.println("load()を実行しました");
		String sql = "select id, name, age, dep_id from test_members where id = :id";

		SqlParameterSource param = new MapSqlParameterSource().addValue("id", id);

		Member member = template.queryForObject(sql, param, MEMBER_ROW_MAPPER); // ←ここに実行処理を書く
		System.out.println(member.toString());
		return member;
	}

	/**
	 * メンバー情報を登録or更新します.
	 * 
	 * @param member メンバー情報
	 * @return メンバー情報
	 */
	public Member save(Member member) {
		SqlParameterSource param = new BeanPropertySqlParameterSource(member);

		
		if (member == null) { // ←正しい条件に修正する
			String insertSql = "insert into test_members (name, age, dep_id) values(:name, :age, :depId)";
			template.update(insertSql, param);
			// ここに実行処理を書く
			

		} else {
			String updateSql = "update test_members set name =:name, age =:age, dep_id =:depId where id =:id";

			// ここに実行処理を書く
			template.update(updateSql, param);
		}

		return member;
	}

}
