package com.hafa.OnlineLibrary.services.map;

import com.hafa.OnlineLibrary.model.Customer;
import com.hafa.OnlineLibrary.services.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class CustomerServiceMap extends AbstractMapService<Customer, Long> implements CustomerService {
    @Override
    public Set<Customer> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Customer save(Customer customer) {
        return super.save(customer.getId(), customer);
    }

    @Override
    public void delete(Customer customer) {

    }

    @Override
    public Customer findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Customer findByLastName(String lastName) {
        return null;
    }

    @Override
    public List<Customer> findAllByLastNameLike(String lastName) {
        return null;
    }
}
