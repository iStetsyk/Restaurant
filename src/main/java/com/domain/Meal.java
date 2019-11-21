package com.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.security.core.parameters.P;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@ToString
public class Meal {

    private Long id;

    private String name;

    private String descrpition;

    private Double price;




}
