package com.zz.webflux.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.zz.webflux.pojo.Member;

@Repository
public interface MemberRepository extends ReactiveMongoRepository<Member, String> {

} 
