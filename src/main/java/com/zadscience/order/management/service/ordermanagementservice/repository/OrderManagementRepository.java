package com.zadscience.order.management.service.ordermanagementservice.repository;

import java.util.ArrayList;
import java.util.List;

import com.zadscience.order.management.service.ordermanagementservice.entities.Customer;
import com.zadscience.order.management.service.ordermanagementservice.entities.Order;
import org.springframework.stereotype.Repository;
@Repository
public class OrderManagementRepository {

    private final List<Order> orders;


    public OrderManagementRepository() {
        orders = new ArrayList<>();
        Customer customer1 = new Customer();
        customer1.setCustomerId(1234567L);
        customer1.setName("CustomerName");
        customer1.setSurname("Surname");
        customer1.setAddressName("Address");
        Order order1 = new Order();
        order1.setCustomer(customer1);
        order1.setOrderNumber(1234567L);
        order1.setTrackingNumber("12345");
        orders.add(order1);

    }

    public List<Order> findAll() {
        return orders;
    }

    public boolean addOrder(Order order) {
        orders.add(order);
        return true;
    }

    public Order getOrder(Long id) {

        Order order=null;
        for(Order item:orders)
        {
            if(item.getOrderNumber().toString().equals(new String(""+id)))
            {
                order = item;
                break;
            }
        }
        return order;
    }

    public boolean deleteOrder(Long id) {
        for (int i = 0; i < orders.size(); i++) {
            Order order = orders.get(i);
            if (order.getOrderNumber() == id) {
                orders.remove(i);
                return true;
            }
        }
        return false;
    }

    public Order updateOrder(Long id, Order updatedOrder) {
        for (int i = 0; i < orders.size(); i++) {
            Order order = orders.get(i);
            if (order.getOrderNumber() == id) {
                orders.set(i, updatedOrder);
                return updatedOrder;
            }
        }
        return null;
    }
}
