package com.ajackus.ajackustask.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ajackus.ajackustask.domain.Department;
import com.ajackus.ajackustask.domain.Employee;
import com.ajackus.ajackustask.repository.DepartmentRepository;
import com.ajackus.ajackustask.repository.EmployeeRepository;
import com.ajackus.ajackustask.repository.RoleRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeController {
	
	private final EmployeeRepository employeeRepository;
	private final RoleRepository roleRepository;
	private final DepartmentRepository departmentRepository;
	


	public EmployeeController(EmployeeRepository employeeRepository, RoleRepository roleRepository,
			DepartmentRepository departmentRepository) {
		this.employeeRepository = employeeRepository;
		this.roleRepository = roleRepository;
		this.departmentRepository = departmentRepository;
	}



	@GetMapping("/dreamteam/employees")

	public List<Employee> getAllEmployees()
	{
		return employeeRepository.findAll();
	}
	
	@PostMapping("/dreamteam/employees")
	public Employee createEmployee(@RequestBody Employee employee)
	{
		
		Employee emp = employeeRepository.save(employee);
		emp.getRoles().forEach(role->role.setRoleName(roleRepository.findById(role.getId()).toString()));
		Department dept = departmentRepository.findById(emp.getDepartment().getId()).get();
		emp.setDepartment(dept);
		return emp;
	}
	
	
	
	@PutMapping("/dreamteam/employees/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @RequestBody Employee employeeDetails){
		Employee employee = employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("Employee not exist with id :" + id));
		
		employee.setId(employeeDetails.getId());
		employee.setEmployeeName(employeeDetails.getEmployeeName());
		employee.setDepartment(employeeDetails.getDepartment());
		employee.setRoles(employeeDetails.getRoles());

		Employee updatedEmployee = employeeRepository.save(employee);
		return ResponseEntity.ok(updatedEmployee);
	}
	
	@GetMapping("/dreamteam/employees/{id}")
	public Employee getEmployeesById(@PathVariable Long id)
	{
		return employeeRepository.findById(id).get();
	}

}
