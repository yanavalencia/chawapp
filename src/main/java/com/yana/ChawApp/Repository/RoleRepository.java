package com.yana.ChawApp.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yana.ChawApp.Model.Role;

public interface RoleRepository extends JpaRepository<Role,Long> {
    Optional<Role> findByName(String name);

}
