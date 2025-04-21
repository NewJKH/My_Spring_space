package com.jkh.space.service;

import com.jkh.space.kim.domain.member.Member;
import com.jkh.space.kim.repository.MemoryMemberRepository;
import com.jkh.space.kim.service.MemberService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class MemberServiceTest {
    private MemoryMemberRepository memberRepository;
    private MemberService memberService;

    @BeforeEach
    public void beforeEach() { // 생성자 느낌?
        memberRepository = new MemoryMemberRepository();
        memberService = new MemberService(memberRepository);
    }

    @AfterEach
    public void afterEach(){
        memberRepository.clearStore();
    }

    @Test
    void join() {
        // g iven
        Member m1 = new Member(0L,"Hello");
        Member m2 = new Member(1L,"Hello"); // 중복회원 검증을 위해서 동일한 이름을 사용

        // w hen
        Long m1Id = memberService.join(m1);
        Long m2Id = memberService.join(m2);


        // t hen
        Member member1 = memberService.findMember(m1Id).get();
        Member member2 = memberService.findMember(m2Id).get();
        assertThrows(IllegalStateException.class, () -> memberService.join(member2));


    }

    @Test
    void findMembers() {

    }

    @Test
    void findMember() {
    }
}