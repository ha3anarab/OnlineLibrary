package com.hafa.onlineLibrary.Controllers;

import com.hafa.OnlineLibrary.services.springdatajpa.CustomerSDService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerSDService customerService;

    public CustomerController(CustomerSDService customerService) {
        this.customerService = customerService;
    }


    @RequestMapping({"", "/", "index", "index.html"})
    public String CustomersList(Model model) {
        model.addAttribute("customer", customerService.findAll());
        return "customers/index";
    }
}
