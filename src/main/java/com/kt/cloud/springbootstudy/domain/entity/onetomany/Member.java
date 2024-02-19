package com.kt.cloud.springbootstudy.domain.entity.onetomany;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    private String id;
    private String name;
    @OneToMany(fetch = FetchType.EAGER)
    @JsonIgnore
    private List<Item> itemList = new ArrayList<>();

    public Member(String name) {
        this.name = name;
    }

    public Member(String name, List<Item> itemList) {
        this.name = name;
        this.itemList = itemList;
    }

}
