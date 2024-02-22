package com.example.demo.service;

import com.example.demo.domain.Book;
import com.example.demo.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BookService {
    private final BookRepository bookRepository;

//    @Autowired//This tells spring to inject an instance of BookRespository into book service
//    public BookService(BookRepository bookRepository){
//        this.bookRepository = bookRepository;
//    }

    //Add a book into our h2-database
    @Transactional
    public Book create(Book book){
        return bookRepository.save(book);
    }

    @Transactional
    public List<Book> findAll(){
        return bookRepository.findAll();
    }
}
