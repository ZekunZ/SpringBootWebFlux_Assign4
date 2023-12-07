package com.zz.webflux.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zz.webflux.pojo.Member;
import com.zz.webflux.repository.MemberRepository;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@Transactional
@AllArgsConstructor
public class MemberService {

	@Autowired
	private MemberRepository memberRepository;
	
    public Mono save(final Member member) {
        return memberRepository.save(member);
    }
    
    public Flux<Member> getAll() {

        return memberRepository.findAll().switchIfEmpty(Flux.empty());

    }
}
