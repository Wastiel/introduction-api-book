package com.example.exemploapi.domain.model.service;

import com.example.exemploapi.domain.model.entity.Book;
import com.example.exemploapi.domain.model.exception.BookNotFound;
import com.example.exemploapi.domain.model.repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@AllArgsConstructor
@Service
public class BookService {

    private final BookRepository bookRepository;

    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    public Book create(Book book) {
        return bookRepository.save(book);
    }

    public Book update(Book book) {
        Book bookdb = findById(book.getId());
        if (book.getName() != null){
            bookdb.setName(book.getName());
        }
        return bookRepository.save(bookdb);
    }

    public void delete(Long id) {
        bookRepository.deleteById(id);
    }

    public Book findById(Long id) {
        return bookRepository.findById(id).orElseThrow(() -> new BookNotFound("Não encontrou o id:" + id));
    }

    public Book findById2(Long id) {
        Optional<Book> book = bookRepository.findById(id);
        if(book.isPresent()){
            return book.get();
        }else{
            throw new BookNotFound("Não existe");
        }
    }
}
