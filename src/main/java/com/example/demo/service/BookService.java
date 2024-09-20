package com.example.demo.service;

import com.example.demo.entity.Book;
import com.example.demo.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    public List<Book> findAll(){
        return bookRepository.findAll(); // select * from Book : JPQL->SQL 전송
    }

    public void deleteById(Long id){
        bookRepository.deleteById(id); // delete from Book b where b.id=?1
    }
}
