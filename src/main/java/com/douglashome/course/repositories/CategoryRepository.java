package com.douglashome.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.douglashome.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
