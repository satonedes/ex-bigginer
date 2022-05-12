package com.example.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class UserForm {
	@NotBlank(message="名前は必須です")
	private String name;
	@NotBlank(message="年齢は必須です")
	@Pattern(regexp="^[0-9]{2}$", message="数値を入力してください")
	private int age;
	@Size(min=1,max=2000,message="1桁以上2000桁以下で入力してください")
	private String comment;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}

}
