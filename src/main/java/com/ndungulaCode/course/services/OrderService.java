package com.ndungulaCode.course.services;

import com.ndungulaCode.course.repositories.OrderRepository;
import com.ndungulaCode.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ndungulaCode.course.entities.Order;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll(){
        return repository.findAll();
    }
    public Order findById(Long id ){
        Optional<Order> obj = repository.findById(id);
        return  obj.get();
    }
}
