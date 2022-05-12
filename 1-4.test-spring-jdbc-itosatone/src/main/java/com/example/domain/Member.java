package com.example.domain;

/**
 * メンバー情報を表すドメイン.
 * 
 * @author igamasayuki
 *
 */
public class Member {
	/** ID */
	private Integer id;
	
	/** 名前 */
	private String name;
	/** 年齢 */
	private Integer age;
	/** 部署ID */
	private Integer dep_id;
	
	public String toString() {
		return "id = " + id + ", name = " + name + ", age" + age + ", dep_id= " + dep_id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getDep_id() {
		return dep_id;
	}

	public void setDep_id(Integer dep_id) {
		this.dep_id = dep_id;
	}


}
