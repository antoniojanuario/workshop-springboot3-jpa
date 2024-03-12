package com.ndungulaCode.course.repositories;

import com.ndungulaCode.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
