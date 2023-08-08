package com.hafa.OnlineLibrary.repositories;

import com.hafa.OnlineLibrary.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Customer findByLastName(String lastName);
    List<Customer> findAllByLastNameLike(String lastName);
}
