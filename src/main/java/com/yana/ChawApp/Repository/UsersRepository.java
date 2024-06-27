package com.yana.ChawApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yana.ChawApp.Model.Users;

public interface UsersRepository extends JpaRepository <Users, Long> {

}
