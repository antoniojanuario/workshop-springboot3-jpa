package com.ndungulaCode.course.repositories;

import com.ndungulaCode.course.entities.Category;
import com.ndungulaCode.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
