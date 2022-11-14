package com.kt.cloud.springbootstudy.domain.repository;

import com.kt.cloud.springbootstudy.domain.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, String> {

    @Query("select m from Member m join fetch m.itemList")
    List<Member> findAll();

}
