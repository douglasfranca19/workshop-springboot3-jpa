package com.douglashome.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.douglashome.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
