package com.spring.angular.springmongoangular.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter @Setter @NoArgsConstructor
@Document(collection = "customer")
public class Customer {
    @Id
    private String id;

    private String name;
    private int age;
    private boolean active;


    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }
}