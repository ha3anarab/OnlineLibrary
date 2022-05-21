package com.hafa.OnlineLibrary.repositories;

import com.hafa.OnlineLibrary.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
