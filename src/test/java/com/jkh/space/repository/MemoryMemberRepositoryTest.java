package com.jkh.space.repository;

import com.jkh.space.kim.domain.member.Member;
import com.jkh.space.kim.repository.MemoryMemberRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class MemoryMemberRepositoryTest{
    MemoryMemberRepository memoryMemberRepository = new MemoryMemberRepository();




    /**
     * 테스트가 실행되고 끝날 때 마다 아래 afterEach 를 실행해서 데이터를 초기화 해줘야함.
     * 테스트는 서로 의존관계(순서) 상관없이 실행이 되어야 한다.
     */

    @AfterEach
    public void afterEach(){
        memoryMemberRepository.clearStore();
    }



    /**
     *  테스트는 하나하나 할때마다 새롭게 만들어주는게 좋다.
     *  어노테이션 @Test 를 선언하고 메서드를 하나씩 구현한다. ( 이게 버릇이 되어야 함.
     *
     */
    @Test
    public void save(){
        Member member = new Member(0L,"스프링");

        memoryMemberRepository.save(member);
        Member member1 = memoryMemberRepository.findById(member.getId()).get();

        Assertions.assertThat(member.getName()).isEqualTo(member1.getName());

    }
    @Test
    public void findByName(){
        Member member = new Member(1L,"이름");
        Member member2 = new Member(2L,"이름2");

        memoryMemberRepository.save(member);
        memoryMemberRepository.save(member2);

        Member mOpt = memoryMemberRepository.findByName("이름").get();
        Member m2Opt = memoryMemberRepository.findByName("이름2").get();

        Assertions.assertThat(mOpt).isEqualTo(member);

    }
}
