package com.jkh.space.fisrt.domain.service;

import com.jkh.space.fisrt.domain.member.Member;
import com.jkh.space.fisrt.repository.MemberRepository;

import java.util.List;

public class MemberService {
    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public long join(Member member){
        // 같은 이름이 있는 중복 회원은 금지
        validateDuplicateMember(member);

        memberRepository.save(member);
        return member.getId();
    }

    private void validateDuplicateMember(Member member) {
        memberRepository.findByName(member.getName())
                .ifPresent(user->{
                    throw new IllegalStateException(" 이미 존재하는 회원 입니다.");
                });
    }
    public List<Member> findMembers(){
        return memberRepository.findAll();
    }

}
