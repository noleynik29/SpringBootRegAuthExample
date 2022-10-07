package com.example.springbootregistrationexample.repository;

import com.example.springbootregistrationexample.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
