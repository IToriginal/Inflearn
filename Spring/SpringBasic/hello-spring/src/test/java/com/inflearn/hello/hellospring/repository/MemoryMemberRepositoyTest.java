package com.inflearn.hello.hellospring.repository;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import com.inflearn.hello.hellospring.domain.Member;

class MemoryMemberRepositoyTest {

    MemoryMemberRepositoy repositoy = new MemoryMemberRepositoy();

    @AfterEach
    public void afterEach() {
        repositoy.clearStore();
    }

    @Test
    public void save() {
        // given
        Member member = new Member();
        member.setName("spring");

        // when
        repositoy.save(member);

        // then
        Member result = repositoy.findById(member.getId()).get();
        assertThat(member).isEqualTo(result);
    }

    @Test
    public void findByName() {
        // given
        Member member1 = new Member();
        member1.setName("spring1");
        repositoy.save(member1);

        Member member2 = new Member();
        member2.setName("spring2");
        repositoy.save(member2);

        // when
        Member result = repositoy.findByName("spring1").get();

        // then
        assertThat(result).isEqualTo(member1);
    }

    @Test
    public void findAll() {
        // given
        Member member1 = new Member();
        member1.setName("spring1");
        repositoy.save(member1);

        Member member2 = new Member();
        member2.setName("spring2");
        repositoy.save(member2);

        // when
        List<Member> result = repositoy.findAll();

        // then
        assertThat(result.size()).isEqualTo(2);
    }

}