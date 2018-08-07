package com.spring.angular.springmongoangular.repo;

import java.util.List;

import com.spring.angular.springmongoangular.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface CustomerRepository extends MongoRepository<Customer, String>{
    List<Customer> findByAge(int age);
}