package com.hafa.OnlineLibrary.services.springdatajpa;

import com.hafa.OnlineLibrary.model.Book;
import com.hafa.OnlineLibrary.repositories.BookRepository;
import com.hafa.OnlineLibrary.services.CrudService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Profile("springdatajpa")
@Service
public class BookSDService implements CrudService<Book, Long> {

    private final BookRepository bookRepository;

    public BookSDService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Set<Book> findAll() {
        HashSet<Book> books = new HashSet<>();
        bookRepository.findAll().forEach(books::add);
        return books;
    }

    @Override
    public Book findById(Long bookId) {
        return bookRepository.findById(bookId).orElse(null);
    }

    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public void delete(Book book) {
        bookRepository.delete(book);
    }

    @Override
    public void deleteById(Long bookId) {
        bookRepository.deleteById(bookId);
    }
}
