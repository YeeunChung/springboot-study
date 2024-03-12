package com.kt.cloud.springbootstudy.service.onetomany;

import com.kt.cloud.springbootstudy.domain.entity.onetomany.Item;
import com.kt.cloud.springbootstudy.domain.entity.onetomany.Member;
import com.kt.cloud.springbootstudy.domain.repository.onetomany.ItemRepository;
import com.kt.cloud.springbootstudy.domain.repository.onetomany.MemberRepository;
import com.kt.cloud.springbootstudy.service.onetomany.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.fluentd.logger.FluentLogger;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
@Slf4j
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;
    private final ItemRepository itemRepository;
    private static FluentLogger LOG = FluentLogger.getLogger("app");

    @Override
    public void save(String name) {
        Member member = new Member(name);
        memberRepository.save(member);

        log.info("Member 저장 성공: " + name);

        Map<String, Object> data = new HashMap<String, Object>();
        data.put("insert", name);
        LOG.log("follow", data);
        LOG.close();
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
    public Member findMember(String name) {
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("find", name);
        LOG.log("follow", data);
        LOG.close();
        return memberRepository.findByName(name);
    }

    @Override
    public List<Member> findAllMembers() {
        return memberRepository.findAll();
    }

}
