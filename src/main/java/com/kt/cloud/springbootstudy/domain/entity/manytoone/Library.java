package com.kt.cloud.springbootstudy.domain.entity.manytoone;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Library {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String name;

    public Library(String name) {
        this.name = name;
    }


}
