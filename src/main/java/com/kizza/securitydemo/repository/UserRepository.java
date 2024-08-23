package com.kizza.securitydemo.repository;

import com.kizza.securitydemo.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<AppUser, Integer> {

    Optional<AppUser> findByEmail(String email);
}
