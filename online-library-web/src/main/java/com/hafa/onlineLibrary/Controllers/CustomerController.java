package com.hafa.onlineLibrary.Controllers;

import com.hafa.OnlineLibrary.model.Customer;
import com.hafa.OnlineLibrary.services.springdatajpa.CustomerSDService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerSDService customerService;

    public CustomerController(CustomerSDService customerService) {
        this.customerService = customerService;
    }

    @InitBinder
    public void setAllowedFields(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields("id");
    }

    @RequestMapping("/find")
    public String findCustomers(Model model) {
        model.addAttribute("customer", Customer.builder().build());
        return "customers/findCustomer";
    }

    @GetMapping
    public String processFindForm(Customer customer, BindingResult result, Model model) {

        // allow parameterless GET request for /customer to return all records
        if (customer.getLastName() == null) {
            customer.setLastName(""); // empty string signifies broadest possible search
        }

        // find customers by last name
        List<Customer> customersResults = customerService.findAllByLastNameLike("%" + customer.getLastName() + "%");
        if (customersResults.isEmpty()) {
            // no customers found
            result.rejectValue("lastName", "notFound", "not found");
            return "customers/findCustomer";
        } else if (customersResults.size() == 1) {
            // 1 customer found
            customer = customersResults.get(0);
            return "redirect:/customers/" + customer.getId();
        } else {
            // multiple customers found
            model.addAttribute("customer", customersResults);
            return "customers/customerList";
        }
    }
}
