package com.domain;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;


import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "users")
@ToString(exclude = "password", callSuper = true)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "userName")
    private String userName;

    @Column(name = "firtName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "city")
    private String city;

    @Column(name = "street_number")
    private String street_Number;

    @Column(name = "postCode")
    private String postCode;

    @Column(name = "password")
    private String password;

    @Column(name = "orderHistory")
    private Set orderHistoryList = new HashSet();
}
