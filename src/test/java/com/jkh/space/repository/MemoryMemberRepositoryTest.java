package com.jkh.space.repository;

import com.jkh.space.fisrt.domain.member.Member;
import com.jkh.space.fisrt.repository.MemoryMemberRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class MemoryMemberRepositoryTest {
    MemoryMemberRepository repository = new MemoryMemberRepository();

    @AfterEach
    public void afterEach(){
        repository.clear();
    }
    @Test
    public void save(){
        Member member = new Member("장군호");
        repository.save(member);

        Member member1 = new Member("장군순");
        repository.save(member1);

        Member member2 = new Member("장군군");
        repository.save(member2);

        Member result = repository.findById(member.getId()).get();
        System.out.println(" 동일 ? "+(result==member));
        assertThat(result).isEqualTo(member);
    }
    @Test
    public void findByName(){
        Member member = new Member("장군호");
        repository.save(member);

        Member member1 = new Member("장군순");
        repository.save(member1);

        Member member2 = new Member("장군군");
        repository.save(member2);

        Optional<Member> optional = repository.findByName("장군호");
        optional.ifPresent(user -> assertThat(member).isEqualTo(user));
    }
    @Test
    public void findAll(){
        Member member = new Member("장군호");
        repository.save(member);

        Member member1 = new Member("장군순");
        repository.save(member1);

        Member member2 = new Member("장군군");
        repository.save(member2);

        List<Member> list = repository.findAll();
        list.forEach(user->
                System.out.print(user.getName())
        );
    }
}
