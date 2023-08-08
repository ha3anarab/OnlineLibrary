package com.hafa.OnlineLibrary.services.springdatajpa;

import com.hafa.OnlineLibrary.model.Customer;

import java.util.List;

public interface CustomerService extends CrudService<Customer, Long> {

    Customer findByLastName(String lastName);
    List<Customer> findAllByLastNameLike(String lastName);

}
