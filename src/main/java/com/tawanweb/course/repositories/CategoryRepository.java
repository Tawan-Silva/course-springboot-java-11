package com.tawanweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tawanweb.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
