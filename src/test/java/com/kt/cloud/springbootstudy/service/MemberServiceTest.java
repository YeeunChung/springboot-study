package com.kt.cloud.springbootstudy.service;

import com.kt.cloud.springbootstudy.domain.entity.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MemberServiceTest {

    @Autowired
    MemberService memberService;

    @Test
    void memberTest() {
        // given
        memberService.save();

        // when
        List<Member> memberList = memberService.findAllMembers();

//        for (Member member: memberList)
//            System.out.println(member.getItemList());

//        Assertions.assertThat(memberList.get).
    }

}