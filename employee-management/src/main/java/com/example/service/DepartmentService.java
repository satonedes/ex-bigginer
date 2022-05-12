package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.Department;
import com.example.repository.DepartmentRepositry;

@Service
@Transactional
public class DepartmentService {
	@Autowired
	private DepartmentRepositry repository;
	
	public Department load(Integer departmentId) {
		return repository.load(departmentId);
	}
	public List<Department> findAll(){
		return repository.findAll();
	}
	public Department save(Department department) {
		return repository.save(department);
	}
	public void deleteByid(Integer departmentId) {
		repository.deleteById(departmentId);
	}

}
