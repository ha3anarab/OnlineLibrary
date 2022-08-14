package com.hafa.OnlineLibrary.repositories;

import com.hafa.OnlineLibrary.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    Customer findByLastName(String lastName);
}
