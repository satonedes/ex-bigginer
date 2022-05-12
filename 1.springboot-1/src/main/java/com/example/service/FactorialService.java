package com.example.service;

import org.springframework.stereotype.Component;

@Component
public class FactorialService {
	public int getFactorial(int num) {
		int i = 1;
		int answer = 1;
		while(i <= num) {
			answer = answer * i;
			i++;
		}
		return answer;
	}

}
