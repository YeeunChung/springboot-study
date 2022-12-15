package com.kt.cloud.springbootstudy.service;

import com.kt.cloud.springbootstudy.domain.entity.manytoone.Book;
import com.kt.cloud.springbootstudy.domain.entity.manytoone.Library;
import com.kt.cloud.springbootstudy.domain.entity.onetomany.Item;
import com.kt.cloud.springbootstudy.domain.entity.onetomany.Member;
import com.kt.cloud.springbootstudy.domain.repository.manytoone.BookRepository;
import com.kt.cloud.springbootstudy.domain.repository.manytoone.LibraryRepository;
import com.kt.cloud.springbootstudy.domain.repository.onetomany.ItemRepository;
import com.kt.cloud.springbootstudy.domain.repository.onetomany.MemberRepository;
import com.kt.cloud.springbootstudy.service.onetomany.MemberService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
//@RequiredArgsConstructor
class MemberServiceTest {

    @Autowired
    MemberService memberService;
    @Autowired
    MemberRepository memberRepository;
    @Autowired
    ItemRepository itemRepository;
    @Autowired
    LibraryRepository libraryRepository;
    @Autowired
    BookRepository bookRepository;

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
        Member member = new Member("member1");

        // when
        memberRepository.save(member);
        System.out.println(member);

        Member member1 = memberRepository.findById(member.getId()).get(); // findById 써보기
        System.out.println(member1);

        // then
        Assertions.assertThat(member.getId()).isNotNull();
        Assertions.assertThat(member1.getId()).isEqualTo(member.getId());
    }

    @DisplayName("연관 관계 테스트 - OneToMany")
    @Test
    void relationshipOneToManyTest() {
        // given
        Item item = new Item("item1");
        itemRepository.save(item);

        // when
        Member member = new Member("member1");
        member.setItemList(new ArrayList<>(Arrays.asList(item)));
        memberRepository.save(member);

        // then

    }

    @DisplayName("연관 관계 테스트 - ManyToOne")
    @Test
    void relationshipManyToOneTest() {
        // given
        Library library = new Library("library1");
        libraryRepository.save(library);

        // when
        Book book = new Book("book1", library);
        bookRepository.save(book);

        // then
    }

}