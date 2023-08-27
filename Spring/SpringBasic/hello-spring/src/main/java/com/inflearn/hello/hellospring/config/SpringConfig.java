package com.inflearn.hello.hellospring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.inflearn.hello.hellospring.aop.TimeTraceAop;
import com.inflearn.hello.hellospring.repository.MemberRepository;
import com.inflearn.hello.hellospring.service.MemberService;

@Configuration
public class SpringConfig {

    private final MemberRepository memberRepository;

    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository);
    }

    // @Bean
    // public TimeTraceAop timeTraceAop() {
    //     return new TimeTraceAop();
    // }

    // @Bean
    // public MemberRepository memberRepository() {
    //     return new MemoryMemberRepositoy();
    //     return new JdbcMemberRepository(dataSource);
    //     return new JdbcTemplateMemberRepository(dataSource);
    //     return new JpaMemberRepository(em);
    // }
}
