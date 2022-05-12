package com.example.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class Ex19Form {
	@NotBlank(message="左のテキストボックスには数値を入力してください")
	@Pattern(regexp = "^[0-9]+$", message = "数値を入力してください")
	private Integer num1;
	
	@NotBlank(message="左のテキストボックスには数値を入力してください")
	@Pattern(regexp = "^[0-9]+$", message = "数値を入力してください")
	private Integer num2;

	public Integer getNum1() {
		return num1;
	}

	public void setNum1(Integer num1) {
		this.num1 = num1;
	}

	public Integer getNum2() {
		return num2;
	}

	public void setNum2(Integer num2) {
		this.num2 = num2;
	}
	
	

}
