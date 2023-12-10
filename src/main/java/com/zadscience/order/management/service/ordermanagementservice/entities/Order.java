package com.zadscience.order.management.service.ordermanagementservice.entities;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class Order implements Serializable {

    private Customer customer;
    private Long orderNumber;
    private String trackingNumber;

    public Order(Customer customer, String trackingNumber) {
        this.customer = customer;
        this.trackingNumber = trackingNumber;
    }

}
