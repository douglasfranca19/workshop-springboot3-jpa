package com.douglashome.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.douglashome.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
