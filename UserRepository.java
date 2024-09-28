package com.deepak.SpringbootDataJpaJSP.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deepak.SpringbootDataJpaJSP.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	User findByEmail(String email);
}
