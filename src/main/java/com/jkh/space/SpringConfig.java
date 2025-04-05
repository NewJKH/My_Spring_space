package com.jkh.space;

import com.jkh.space.fisrt.domain.service.MemberService;
import com.jkh.space.fisrt.repository.MemberRepository;
import com.jkh.space.fisrt.repository.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }
} 
