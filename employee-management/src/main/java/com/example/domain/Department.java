package com.example.domain;

public class Department {
	private String name;
	private Integer id;
	
	@Override
	public String toString() {
		return "Employee [id = " + id + ",name =" + name + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	

}
