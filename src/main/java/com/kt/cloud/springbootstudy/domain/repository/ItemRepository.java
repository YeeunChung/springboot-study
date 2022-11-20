package com.kt.cloud.springbootstudy.domain.repository;

import com.kt.cloud.springbootstudy.domain.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ItemRepository extends JpaRepository<Item, UUID> {
}
