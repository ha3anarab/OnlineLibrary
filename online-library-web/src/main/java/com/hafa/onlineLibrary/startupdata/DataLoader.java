package com.hafa.onlineLibrary.startupdata;

import com.hafa.OnlineLibrary.model.Author;
import com.hafa.OnlineLibrary.model.Book;
import com.hafa.OnlineLibrary.model.Customer;
import com.hafa.OnlineLibrary.services.springdatajpa.AuthorSDService;
import com.hafa.OnlineLibrary.services.springdatajpa.BookSDService;
import com.hafa.OnlineLibrary.services.springdatajpa.CustomerSDService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class DataLoader implements CommandLineRunner {

    private final CustomerSDService customerService;
    private final BookSDService bookService;
    private final AuthorSDService authorService;

    public DataLoader(CustomerSDService customerService, BookSDService bookService, AuthorSDService authorService) {
        this.customerService = customerService;
        this.bookService = bookService;
        this.authorService = authorService;
    }

    @Override
    public void run(String... args) throws Exception {

//        saveNewCustomer();
//        saveNewAuthorAndBook();

//        printSavedData();
    }

    private void printSavedData() {
        System.out.println("Load DATA ...");
        Set<Customer> all = customerService.findAll();
        for (Customer customer : all) {
            System.out.println(customer.getId() + " " + customer.getFirstName() + " " + customer.getLastName());
        }

        Set<Author> authorSet = authorService.findAll();
        for (Author author : authorSet) {
            System.out.println(author.getId() + " " + author.getFirstName() + " " + author.getLastName());
        }

        Set<Book> bookSet = bookService.findAll();
        for (Book book : bookSet) {
            System.out.println(book.getId() + " " + book.getAuthor() + " " + book.getPrice());
        }
    }

    private void saveNewCustomer() {
        Customer customer1 = new Customer();
        customer1.setId(1L);
        customer1.setFirstName("Nazanin");
        customer1.setLastName("Arab");
        customerService.save(customer1);

        Customer customer2 = new Customer();
        customer2.setId(2L);
        customer2.setFirstName("Hassan");
        customer2.setLastName("Arab");
        customerService.save(customer2);
    }

    private void saveNewAuthorAndBook() {
        Author author1 = new Author();
        author1.setId(1L);
        author1.setFirstName("George");
        author1.setLastName("Orwell");
        authorService.save(author1);

        Book book1 = new Book();
        book1.setId(11L);
        book1.setName("Animal Farm");
        book1.setAuthor(author1);
        book1.setPrice(50000D);
        bookService.save(book1);
    }
}
