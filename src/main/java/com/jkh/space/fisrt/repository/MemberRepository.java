package com.jkh.space.fisrt.repository;

import com.jkh.space.fisrt.domain.member.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(long id);
    Optional<Member> findByName(String name);
    List<Member> findAll();
}
