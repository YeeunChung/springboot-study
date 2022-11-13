package com.kt.cloud.springbootstudy.service;

import com.kt.cloud.springbootstudy.domain.entity.Member;
import com.kt.cloud.springbootstudy.domain.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    @Override
    public void save() {

        Member member1 = new Member();
        memberRepository.save(member1);
        log.info("저장 성공");

    }

    @Override
    public List<Member> findAllMembers() {
        return null;
    }

}
