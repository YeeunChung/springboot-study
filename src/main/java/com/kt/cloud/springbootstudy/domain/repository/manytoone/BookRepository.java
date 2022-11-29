package com.kt.cloud.springbootstudy.domain.repository.manytoone;

import com.kt.cloud.springbootstudy.domain.entity.manytoone.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BookRepository extends JpaRepository<Book, UUID> {
}
