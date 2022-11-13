package com.kt.cloud.springbootstudy.domain.entity;

import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Member {

    @Id
    @Generated
    private String id;
    private String name;

    public Member(String name) {
        this.name = name;
    }
}
