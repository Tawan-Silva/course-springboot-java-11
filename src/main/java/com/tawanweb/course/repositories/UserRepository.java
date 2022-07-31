package com.tawanweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tawanweb.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
