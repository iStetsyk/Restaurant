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
    @Column(name = "order_id")
    private Long id;

    @Column(name = "orderDate")
    private LocalDateTime orderTime;

    @OneToMany(mappedBy = "order")
    private Set<OrderMealQuantity> entries = new HashSet<>();

    @ManyToOne
    private User user;









}
