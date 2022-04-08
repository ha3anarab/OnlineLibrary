package com.hafa.OnlineLibrary.services;

import com.hafa.OnlineLibrary.model.Customer;

import java.util.Set;

public interface CustomerService {

    Customer findByLastName(String lastName);
    Customer findById(Long id);
    Set<Customer> findAll();

    Customer save(Customer customer);

}
