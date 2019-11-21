package com.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
public class OrderMealQuantity {

    @ManyToOne
    private Order order;

    @ManyToOne
    private Meal meal;

    private int quantity;
}
