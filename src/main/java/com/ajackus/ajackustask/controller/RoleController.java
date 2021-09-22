package com.ajackus.ajackustask.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ajackus.ajackustask.domain.Role;
import com.ajackus.ajackustask.repository.RoleRepository;

@RestController
public class RoleController {
	private final RoleRepository roleRepository;

	public RoleController(RoleRepository roleRepository) {
		this.roleRepository = roleRepository;
	}

	@GetMapping("/dreamteam/roles")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Role> getAllRoles()
	{
		return roleRepository.findAll();
	}
	

}
