package com.ajackus.ajackustask.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ajackus.ajackustask.domain.Department;
import com.ajackus.ajackustask.domain.DepartmentRoleCount;
import com.ajackus.ajackustask.repository.DepartmentRepository;

@RestController
public class DepartmentController {
	private final DepartmentRepository departmentRepository;

	public DepartmentController(DepartmentRepository departmentRepository) {
		this.departmentRepository = departmentRepository;
	}
	
	@GetMapping("/dreamteam/departments")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Department> getDepartments()
	{
		return departmentRepository.findAll();
	}
	
	@GetMapping("/dreamteam/departments/rolecount")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<DepartmentRoleCount> getRoleCountByDepartment()
	{
		return departmentRepository.findRoleCountByDepartment();
	}

}
