package com.hafa.OnlineLibrary.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "author")
public class Author extends Person {

    @Column(name = "birth_date")
    private Date birthDate;

    @OneToMany(mappedBy = "author")
    private Set<Book> books = new HashSet<>();
}
