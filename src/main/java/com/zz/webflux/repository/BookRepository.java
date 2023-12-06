package com.zz.webflux.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.zz.webflux.pojo.Book;

@Repository
public interface BookRepository extends ReactiveMongoRepository<Book, String> {

}
