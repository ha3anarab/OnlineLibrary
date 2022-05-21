package com.hafa.OnlineLibrary.repositories;

import com.hafa.OnlineLibrary.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
