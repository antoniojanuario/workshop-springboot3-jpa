package com.ndungulaCode.course.repositories;

import com.ndungulaCode.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
