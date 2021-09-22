package com.ajackus.ajackustask.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ajackus.ajackustask.domain.Department;
import com.ajackus.ajackustask.domain.DepartmentRoleCount;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
	
	@Query(nativeQuery = true, value = "select D.DEPT_NAME as DepartmentName, COUNT(R.ROLE_ID) as RoleCount FROM DEPARTMENT D INNER JOIN EMPLOYEE E ON E.DEPT_ID=D.DEPT_ID INNER JOIN EMP_ROLES R ON R.EMP_ID = E.EMP_ID GROUP BY D.DEPT_NAME")
	    List<DepartmentRoleCount> findRoleCountByDepartment();

}
