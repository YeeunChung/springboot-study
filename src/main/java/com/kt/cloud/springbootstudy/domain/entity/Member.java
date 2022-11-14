package com.kt.cloud.springbootstudy.domain.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Member {

    @Id
    private String id;
    private String name;
    @OneToMany(fetch = FetchType.EAGER)
    private List<Item> itemList = new ArrayList<>();

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

}
