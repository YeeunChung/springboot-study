package com.kt.cloud.springbootstudy.domain.repository;

import com.kt.cloud.springbootstudy.domain.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, String> {
}
