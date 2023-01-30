package com.inflearn.hello.hellospring;

import com.inflearn.hello.hellospring.repository.MemberRepository;
import com.inflearn.hello.hellospring.repository.MemoryMemberRepositoy;
import com.inflearn.hello.hellospring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepositoy();
    }
}
