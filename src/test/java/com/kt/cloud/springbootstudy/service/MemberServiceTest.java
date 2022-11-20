package com.kt.cloud.springbootstudy.service;

import com.kt.cloud.springbootstudy.domain.entity.Member;
import com.kt.cloud.springbootstudy.domain.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Slf4j
//@RequiredArgsConstructor
class MemberServiceTest {

    @Autowired
    MemberService memberService;
    @Autowired
    MemberRepository memberRepository;

    @DisplayName("N+1 문제 발생 테스트")
    @Test
    void memberNpulusOneTest() {
        // given
        memberService.save100();

        // when
        List<Member> memberList = memberService.findAllMembers();

        // then
    }

    @DisplayName("ID 자동 생성 테스트")
    @Test
    void memberIdAutoGenerateTest() {
        // given
        Member member = new Member();
        member.setName("member1");

        // when
        memberRepository.save(member);
        log.info(String.valueOf(member));

        // then
        Assertions.assertThat(member.getId()).isNotNull();
    }

}