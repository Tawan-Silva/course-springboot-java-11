package com.tawanweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tawanweb.course.entities.OrderItem;
import com.tawanweb.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
