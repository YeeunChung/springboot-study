package com.kt.cloud.springbootstudy.domain.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Item {

    @Id
    private String id;
    private String name;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "member_id")
    private Member member;

}
