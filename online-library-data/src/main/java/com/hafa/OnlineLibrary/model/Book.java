package com.hafa.OnlineLibrary.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "book")
public class Book extends BaseEntity {

    @Builder
    public Book(Long id, String name, String isbn, Author author, Date printDate, Double price, String description, Customer borrowedPerson) {
        this.setId(id);
        this.name = name;
        this.isbn = isbn;
        this.author = author;
        this.printDate = printDate;
        this.price = price;
        this.description = description;
        this.borrowedPerson = borrowedPerson;
    }

    @Column(name = "name")
    private String name;

    @Column(name = "isbn")
    private String isbn;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

    @Column(name = "print_date")
    private Date printDate;

    @Column(name = "price")
    private Double price;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer borrowedPerson;
}
