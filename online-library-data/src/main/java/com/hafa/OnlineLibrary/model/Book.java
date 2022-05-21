package com.hafa.OnlineLibrary.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "book")
public class Book extends BaseEntity {

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
