package com.hafa.OnlineLibrary.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Book extends BaseEntity {

    private String name;
    private String isbn;
    private Author author;
    private Date printDate;
    private Double price;
    private String description;
}
