package com.zz.webflux.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.zz.webflux.pojo.Publisher;

public interface PublisherRepository extends ReactiveMongoRepository<Publisher, String> {

}
