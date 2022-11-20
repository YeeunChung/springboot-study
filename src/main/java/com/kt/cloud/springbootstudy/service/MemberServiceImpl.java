package com.kt.cloud.springbootstudy.service;

import com.kt.cloud.springbootstudy.domain.entity.Item;
import com.kt.cloud.springbootstudy.domain.entity.Member;
import com.kt.cloud.springbootstudy.domain.repository.ItemRepository;
import com.kt.cloud.springbootstudy.domain.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;
    private final ItemRepository itemRepository;

    @Override
    public void save() {



    }

    public void save100() {
        for (int i=0; i<10; ++i) {
            List<Item> itemList = new ArrayList<>();
            for (int j=i*10; j<(i+1)*10; ++j) {
                Item item = new Item( "name" + j);
                itemList.add(item);
            }
            itemRepository.saveAll(itemList);

            Member member = new Member("name" + i, itemList);
            memberRepository.save(member);
        }

        log.info("저장 성공");
    }

    @Override
    public List<Member> findAllMembers() {
        return memberRepository.findAll();
    }

}
