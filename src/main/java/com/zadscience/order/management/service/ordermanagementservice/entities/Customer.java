package com.zadscience.order.management.service.ordermanagementservice.entities;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;


@Getter
@Setter
public class Customer implements Serializable {

    private Long customerId;
    private String name;
    private String surname;
    private String addressName;
}
