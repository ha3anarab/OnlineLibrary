package com.hafa.OnlineLibrary.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "author")
public class Author extends Person {

    @Builder
    public Author(Long id, String firstName, String lastName, Date birthDate, Set<Book> books) {
        super(id, firstName, lastName);
        this.birthDate = birthDate;
        this.books = books;
    }

    @Column(name = "birth_date")
    private Date birthDate;

    @OneToMany(mappedBy = "author")
    private Set<Book> books = new HashSet<>();
}
