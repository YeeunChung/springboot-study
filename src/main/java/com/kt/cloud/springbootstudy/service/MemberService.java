package com.kt.cloud.springbootstudy.service;

import com.kt.cloud.springbootstudy.domain.entity.Member;

import java.util.List;

public interface MemberService {

    void save();
    void save100();
    List<Member> findAllMembers();

}
