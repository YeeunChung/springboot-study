package com.kt.cloud.springbootstudy.service.onetomany;

import com.kt.cloud.springbootstudy.domain.entity.onetomany.Member;

import java.util.List;

public interface MemberService {

    void save();
    void save100();
    List<Member> findAllMembers();

}
