package com.jkh.space.kim.service;

import com.jkh.space.kim.domain.member.Member;
import com.jkh.space.kim.repository.MemberRepository;
import com.jkh.space.kim.repository.MemoryMemberRepository;

import java.util.List;
import java.util.Optional;

public class MemberService {
    private final MemberRepository memberRepository;

    public MemberService(MemoryMemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    /**
     * @param member 회원
     * @return 회원가입한 ID 반환
     */
    public Long join(Member member) {
        // 중복회원은 거절
        validateDuplicate(member); // 중복 회원검증
        memberRepository.save(member);
        return member.getId();
    }

    private void validateDuplicate(Member member) {
        memberRepository.findByName(member.getName())
                .ifPresent(m->{
                    throw new IllegalStateException("이미 존재하는 회원입니다.");
                });
    }

    public List<Member> findMembers(){
        return memberRepository.findAll();
    }

    public Optional<Member> findMember(Long id){
        return memberRepository.findById(id);
    }
}
