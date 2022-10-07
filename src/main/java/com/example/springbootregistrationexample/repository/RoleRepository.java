package com.example.springbootregistrationexample.repository;

import com.example.springbootregistrationexample.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
