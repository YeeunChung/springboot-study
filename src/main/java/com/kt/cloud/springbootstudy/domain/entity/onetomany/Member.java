package com.kt.cloud.springbootstudy.domain.entity.onetomany;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String name;
    @OneToMany(fetch = FetchType.EAGER)
    private List<Item> itemList = new ArrayList<>();

    public Member(String name) {
        this.name = name;
    }

    public Member(String name, List<Item> itemList) {
        this.name = name;
        this.itemList = itemList;
    }

}