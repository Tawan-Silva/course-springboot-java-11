package com.tawanweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tawanweb.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
