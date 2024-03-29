package com.kt.cloud.springbootstudy.domain.repository.onetomany;

import com.kt.cloud.springbootstudy.domain.entity.onetomany.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface MemberRepository extends JpaRepository<Member, String> {

    @Query("select m from Member m join fetch m.itemList")
    List<Member> findAll();

    Member findByName(String name);
}
