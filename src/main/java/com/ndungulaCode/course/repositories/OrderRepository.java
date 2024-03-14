package com.ndungulaCode.course.repositories;

import com.ndungulaCode.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
