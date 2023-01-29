package com.inflearn.hello.hellospring.repository;

import com.inflearn.hello.hellospring.domain.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.*;

class MemoryMemberRepositoyTest { // 다른 곳에 가져다 쓸 것이 아니기 때문에 public을 할 필요가 없다
    MemoryMemberRepositoy repositoy = new MemoryMemberRepositoy();

    /**
     * @AfterEach
     * Test는 서로 의존 관계가 없이 Test가 이루어져야 한다.
     * 그러기 위해서는 하나의 Test가 끝이 날때마다 저장소나 공용 데이터를 깨끗하게 지워줘야 한다.
     */
    @AfterEach
    public void afterEach() {
        repositoy.clearStore();
    }

    @Test
    public void save(){
        Member member = new Member();
        member.setName("spring");

        repositoy.save(member);

        Member result = repositoy.findById(member.getId()).get();
        assertThat(member).isEqualTo(result);
    }

    @Test
    public void findByName() {
        Member member1 = new Member();
        member1.setName("spring1");
        repositoy.save(member1);

        //이름 변경 tip: member copy 후 "shift" + "F6"
        Member member2 = new Member();
        member2.setName("spring2");
        repositoy.save(member2);

        Member result = repositoy.findByName("spring1").get();
        assertThat(result).isEqualTo(member1);
    }

    @Test
    public void findAll() {
        Member member1 = new Member();
        member1.setName("spring1");
        repositoy.save(member1);

        Member member2 = new Member();
        member2.setName("spring2");
        repositoy.save(member2);

        List<Member> result = repositoy.findAll();
        assertThat(result.size()).isEqualTo(2);
    }
}
