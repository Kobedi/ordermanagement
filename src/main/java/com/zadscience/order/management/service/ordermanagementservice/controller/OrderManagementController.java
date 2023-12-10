package com.zadscience.order.management.service.ordermanagementservice.controller;


import com.zadscience.order.management.service.ordermanagementservice.entities.Order;
import com.zadscience.order.management.service.ordermanagementservice.repository.OrderManagementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("api/v1/orders")
public class OrderManagementController {

    @Autowired
    private OrderManagementRepository orderManagementRepository;

    @PostMapping(value = "/createorder")
    public ResponseEntity newOrder(@RequestBody Order order) {
        orderManagementRepository.addOrder(order);
        return new ResponseEntity(order, HttpStatus.CREATED);
    }

    @GetMapping(value = "/orders")
    public List getOrders() {
        List orders = orderManagementRepository.findAll();
        return orders;
    }

    @GetMapping(value = "/retrieve/{id}")
    public ResponseEntity getOrder(@PathVariable Long id) {
        Order order = orderManagementRepository.getOrder(id);
        if(order != null) {
            return new ResponseEntity(order, HttpStatus.ACCEPTED);
        }
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

}
