package com.inflearn.hello.hellospring.repository;

import java.util.List;
import java.util.Optional;

import com.inflearn.hello.hellospring.domain.Member;


public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);
    List<Member> findAll();
}
