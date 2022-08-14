package com.hafa.OnlineLibrary.services.springdatajpa;

import com.hafa.OnlineLibrary.model.Customer;
import com.hafa.OnlineLibrary.repositories.BookRepository;
import com.hafa.OnlineLibrary.repositories.CustomerRepository;
import com.hafa.OnlineLibrary.services.CustomerService;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Profile("springdatajpa")
@Service
@Primary
public class CustomerSDService implements CustomerService {

    private final CustomerRepository customerRepository;
    private final BookRepository bookRepository;

    public CustomerSDService(CustomerRepository customerRepository, BookRepository bookRepository) {
        this.customerRepository = customerRepository;
        this.bookRepository = bookRepository;
    }


    @Override
    public Set<Customer> findAll() {
        Set<Customer> customers = new HashSet<>();
        customerRepository.findAll().forEach(customers::add);
        return customers;
    }

    @Override
    public Customer findById(Long id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public void delete(Customer customer) {
        customerRepository.delete(customer);
    }

    @Override
    public void deleteById(Long id) {
        customerRepository.deleteById(id);
    }

    @Override
    public Customer findByLastName(String lastName) {
        return customerRepository.findByLastName(lastName);
    }
}
