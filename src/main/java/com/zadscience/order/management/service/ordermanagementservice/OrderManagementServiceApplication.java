package com.zadscience.order.management.service.ordermanagementservice;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zadscience.order.management.service.ordermanagementservice.entities.Customer;
import com.zadscience.order.management.service.ordermanagementservice.entities.Order;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.ArrayList;


@SpringBootApplication
public class OrderManagementServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderManagementServiceApplication.class, args);

	}


}
