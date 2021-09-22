package com.ajackus.ajackustask.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "emp_id")
	private Long id;
	private String employeeName;
	
	 @ManyToMany(fetch = FetchType.EAGER)
	 @JoinTable( name = "emp_roles", joinColumns = @JoinColumn(name = "emp_id"),
	            inverseJoinColumns = @JoinColumn(name = "role_id")
	    )
	private Set<Role> roles = new HashSet<>();
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "dept_id")
	private Department department;
	

}
