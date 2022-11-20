package com.kt.cloud.springbootstudy.domain.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String name;
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "member_id")
//    private Member member;

    public Item(String name) {
        this.name = name;
    }

}
