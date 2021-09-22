package com.ajackus.ajackustask.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ajackus.ajackustask.domain.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
