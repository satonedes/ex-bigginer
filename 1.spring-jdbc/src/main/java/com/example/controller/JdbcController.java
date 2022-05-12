package com.example.controller;

import org.apache.logging.log4j.message.AsynchronouslyFormattable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jdbc")
public class JdbcController {
	@Autowired
	private NamedParameterJdbcTemplate template;
	
	@RequestMapping("/execute")
	public String execute() {
		String sql = "select count(*) from departments"
				+ " where id = :firstId or id = :secondId;";
		SqlParameterSource param = new MapSqlParameterSource()
				.addValue("firstId", "総務部").addValue("secondId", "技術部");
		Integer result = template.queryForObject(sql, param, Integer.class);
		System.out.println("result = " + result);
		return "finished";
	}

}
