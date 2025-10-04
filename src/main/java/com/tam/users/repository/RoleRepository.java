package com.tam.users.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tam.users.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
	Role findByRole(String role);
}
