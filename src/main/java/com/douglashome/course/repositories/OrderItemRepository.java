package com.douglashome.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.douglashome.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
