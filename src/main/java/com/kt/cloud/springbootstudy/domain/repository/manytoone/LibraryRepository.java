package com.kt.cloud.springbootstudy.domain.repository.manytoone;

import com.kt.cloud.springbootstudy.domain.entity.manytoone.Library;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface LibraryRepository extends JpaRepository<Library, UUID> {
}
