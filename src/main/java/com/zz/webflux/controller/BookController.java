package com.zz.webflux.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zz.webflux.pojo.Book;
import com.zz.webflux.service.BookService;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequestMapping("book")
@AllArgsConstructor
@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;
	
    @PostMapping
    public Mono save(@RequestBody final Book book) {

          System.out.println("Added book Info "+ book.getBookId() + " - " + book.getTitle()

          + " - " + book.getAuthor() + " - $" + book.getPrice() + " - Avaiable: " + book.isAvailable());

          return bookService.save(book);

    }
    
    @GetMapping
    public Flux<Book> getAll() {

          System.out.println("All books information");

          return bookService.getAll();

    }

}
