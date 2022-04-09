package com.hafa.onlineLibrary.startupdata;

import com.hafa.OnlineLibrary.model.Customer;
import com.hafa.OnlineLibrary.services.CustomerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class DataLoader implements CommandLineRunner {

    private final CustomerService customerService;

    public DataLoader(CustomerService customerService) {
        this.customerService = customerService;
    }

    @Override
    public void run(String... args) throws Exception {

        Customer customer1 = new Customer();
        customer1.setId(1L);
        customer1.setFirstName("Nazanin");
        customer1.setLastName("Arab");
        customerService.save(customer1);

        System.out.println("Load DATA ...");
        Set<Customer> all = customerService.findAll();
        for (Customer customer : all) {
            System.out.println(customer.getId() + customer.getFirstName());
        }
    }
}
