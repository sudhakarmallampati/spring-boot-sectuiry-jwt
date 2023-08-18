package com.sudhakar.springjwt.repository;

import java.util.Optional;

import com.sudhakar.springjwt.models.ERole;
import com.sudhakar.springjwt.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
  Optional<Role> findByName(ERole name);
}
