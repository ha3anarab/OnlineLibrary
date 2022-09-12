package com.hafa.onlineLibrary.Controllers;

import com.hafa.OnlineLibrary.services.springdatajpa.AuthorSDService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/authors")
public class AuthorController {

    private final AuthorSDService authorService;

    public AuthorController(AuthorSDService authorService) {
        this.authorService = authorService;
    }


    @RequestMapping({"", "/", "index", "index.html"})
    public String AuthorsList(Model model) {
        model.addAttribute("author", authorService.findAll());
        return "authors/index";
    }
}
