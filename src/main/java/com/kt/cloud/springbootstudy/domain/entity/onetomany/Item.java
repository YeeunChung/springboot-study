package com.kt.cloud.springbootstudy.domain.entity.onetomany;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    private String id;
    private String name;
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "member_id")
//    private Member member;

    public Item(String name) {
        this.name = name;
    }

}
