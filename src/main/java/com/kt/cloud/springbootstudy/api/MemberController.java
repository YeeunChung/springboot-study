package com.kt.cloud.springbootstudy.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import com.kt.cloud.springbootstudy.domain.entity.onetomany.Member;
import com.kt.cloud.springbootstudy.service.onetomany.MemberService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/member")
@Slf4j
public class MemberController {

	private final MemberService memberService;

	@GetMapping("/all")
	public List<Member> getAllMembers() {
		return memberService.findAllMembers();
	}


	@GetMapping("/{name}")
	public Member getMember(@PathVariable String name) {
		return memberService.findMember(name);
	}

	@PostMapping("/{name}")
	public void addMember(@PathVariable String name) {
		memberService.save(name);
	}

}
