package com.zz.webflux.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zz.webflux.pojo.Book;
import com.zz.webflux.repository.BookRepository;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@Transactional
@AllArgsConstructor
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;
	
    public Mono save(final Book book) {
        return bookRepository.save(book);
    }
    
    public Flux<Book> getAll() {

        return bookRepository.findAll().switchIfEmpty(Flux.empty());

  }

}
