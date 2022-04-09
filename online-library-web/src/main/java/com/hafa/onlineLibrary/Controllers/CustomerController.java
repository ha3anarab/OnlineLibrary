package com.hafa.onlineLibrary.Controllers;

import com.hafa.OnlineLibrary.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }


    @RequestMapping({"", "/", "index", "index.html"})
    public String CustumerList(Model model) {
        model.addAttribute("customer", customerService.findAll());
        return "customers/index";
    }
}
