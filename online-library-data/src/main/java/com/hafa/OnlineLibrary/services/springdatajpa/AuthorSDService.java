package com.hafa.OnlineLibrary.services.springdatajpa;

import com.hafa.OnlineLibrary.model.Author;
import com.hafa.OnlineLibrary.repositories.AuthorRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Profile("springdatajpa")
@Service
public class AuthorSDService implements CrudService<Author, Long> {

    private final AuthorRepository authorRepository;

    public AuthorSDService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Set<Author> findAll() {
        HashSet<Author> authors = new HashSet<>();
        authorRepository.findAll().forEach(authors::add);
        return authors;
    }

    @Override
    public Author findById(Long authorId) {
        return authorRepository.findById(authorId).orElse(null);
    }

    @Override
    public Author save(Author author) {
        return authorRepository.save(author);
    }

    @Override
    public void delete(Author author) {
        authorRepository.delete(author);
    }

    @Override
    public void deleteById(Long authorId) {
        authorRepository.deleteById(authorId);
    }
}
