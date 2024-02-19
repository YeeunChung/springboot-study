package com.kt.cloud.springbootstudy.service.onetomany;

import com.kt.cloud.springbootstudy.domain.entity.onetomany.Member;

import java.util.List;

public interface MemberService {

    void save(String name);
    void save100();
    Member findMember(String name);
    List<Member> findAllMembers();

}
