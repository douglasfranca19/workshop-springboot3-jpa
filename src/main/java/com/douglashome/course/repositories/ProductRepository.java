package com.douglashome.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.douglashome.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
