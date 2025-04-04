package com.jkh.space.fisrt.domain.service;

import com.jkh.space.fisrt.domain.member.Member;
import com.jkh.space.fisrt.repository.MemoryMemberRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class MemberServiceTest {

    private MemberService service;
    private MemoryMemberRepository repository;

    @BeforeEach
    public void beforeEach(){
        repository = new MemoryMemberRepository();
        service = new MemberService(repository);
    }

    @AfterEach
    public void afterEach(){
        repository.clear();
    }

    @Test
    void join_회원가입() {
        // given
        Member member = new Member("장군호");
        // when
        long saveId = service.join(member);

        // then

    }
    @Test
    void 중복_회원(){
        //give
        Member member1 = new Member("장군호");
        Member member2 = new Member("장군호");
        // when
        service.join(member1);
        IllegalStateException e = assertThrows(IllegalStateException.class,() -> service.join(member2));

        /// then
    }

    @Test
    void findMembers_회원찾기() {

    }
}