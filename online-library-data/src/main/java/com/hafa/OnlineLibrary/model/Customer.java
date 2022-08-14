package com.hafa.OnlineLibrary.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "customer")
public class Customer extends Person {

    @Builder
    public Customer(Long id,String firstName, String lastName, String address, String phoneNumber, Set<Book> borrowedBooks) {
        super(id, firstName, lastName);
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.borrowedBooks = borrowedBooks;
    }

    @Column(name = "address")
    private String address;

    @Column(name = "phone_number")
    private String phoneNumber;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "borrowedPerson")
    private Set<Book> borrowedBooks = new HashSet<>();
}
