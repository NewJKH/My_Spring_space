package com.jkh.space.fisrt.controller;

import com.jkh.space.fisrt.domain.member.Member;
import com.jkh.space.fisrt.domain.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {
    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/members/new")
    public String create(){
        return "members/createMembers";
    }

    /**
     * @param form POST 방식으로 값을 받음
     * @return 리 다이렉트를 해서 다시 홈 페이지로 이동
     * */
    @PostMapping("members/new")
    public String create(MemberForm form){
        Member member = new Member(form.getName());
        memberService.join(member);
        return "redirect:/";
    }

}
