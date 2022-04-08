package com.hafa.OnlineLibrary.services;

import com.hafa.OnlineLibrary.model.Customer;

public interface CustomerService extends CrudService<Customer, Long> {

    Customer findByLastName(String lastName);

}
