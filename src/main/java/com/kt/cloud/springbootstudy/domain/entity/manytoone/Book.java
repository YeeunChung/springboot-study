package com.kt.cloud.springbootstudy.domain.entity.manytoone;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String name;
    @ManyToOne
    @JoinColumn(name = "library_id")
    private Library library;

    public Book(String name) {
        this.name = name;
    }

    public Book(String name, Library library) {
        this.name = name;
        this.library = library;
    }

}
