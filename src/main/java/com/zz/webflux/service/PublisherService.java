package com.zz.webflux.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zz.webflux.pojo.Publisher;
import com.zz.webflux.repository.PublisherRepository;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@Transactional
@AllArgsConstructor
public class PublisherService {

	@Autowired
	private PublisherRepository publisherRepository;
	
    public Mono save(final Publisher publisher) {
        return publisherRepository.save(publisher);
    }
    
    public Flux<Publisher> getAll() {

        return publisherRepository.findAll().switchIfEmpty(Flux.empty());

  }
}
