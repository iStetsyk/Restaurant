package com.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.security.core.parameters.P;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "meals")
@ToString
public class Meal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "mealName")
    private String mealName;

    @Column(name = "description")
    private String descrpition;

    @Column(name = "price")
    private Double price;




}
