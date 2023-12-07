package com.zz.webflux.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zz.webflux.pojo.Publisher;
import com.zz.webflux.service.PublisherService;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequestMapping("publisher")
@AllArgsConstructor
@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class PublisherController {
	@Autowired
	private PublisherService publisherService;
	
    @PostMapping
    public Mono save(@RequestBody final Publisher publisher) {

          System.out.println("Added publisher Info "+ publisher.getPubId() + " - " + publisher.getAddress()

          + " - " + publisher.getName());

          return publisherService.save(publisher);

    }
    
    @GetMapping
    public Flux<Publisher> getAll() {

          System.out.println("All publishers information");

          return publisherService.getAll();

    }
}
