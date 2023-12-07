package com.zz.webflux.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zz.webflux.pojo.Member;
import com.zz.webflux.service.MemberService;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequestMapping("member")
@AllArgsConstructor
@RestController
public class MemberController {
	@Autowired
	private MemberService memberService;
	
    @PostMapping
    public Mono save(@RequestBody final Member member) {

          System.out.println("Added member Info "+ member.getMemberId() + " - " + member.getName()

          + " - " + member.getAddress() + " - " + member.getMemberType() + " -  " + member.getMemberDate() + " -  " + member.getExpiryDate());

          return memberService.save(member);

    }
    
    @GetMapping
    public Flux<Member> getAll() {

          System.out.println("All members information");

          return memberService.getAll();

    }
}
