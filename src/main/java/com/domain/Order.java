package com.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "orders")
@ToString
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Meals")
    @OneToMany
    private Set<OrderMealQuantity> meals = new HashSet<>();

    @Column(name = "orderDate")
    private LocalDateTime orderTime;


    private boolean isDeleted;










}
