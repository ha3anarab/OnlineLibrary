package com.hafa.onlineLibrary.Controllers;

import com.hafa.OnlineLibrary.services.springdatajpa.BookSDService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/books")
public class BookController {

    private final BookSDService bookService;

    public BookController(BookSDService bookService) {
        this.bookService = bookService;
    }


    @GetMapping({"", "/", "index", "index.html"})
    public String BooksList(Model model) {
        model.addAttribute("book", bookService.findAll());
        return "books/index";
    }
}
