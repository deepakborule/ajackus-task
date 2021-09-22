package com.ajackus.ajackustask.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ajackus.ajackustask.domain.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
