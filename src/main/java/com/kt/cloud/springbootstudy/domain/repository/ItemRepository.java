package com.kt.cloud.springbootstudy.domain.repository;

import com.kt.cloud.springbootstudy.domain.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, String> {
}
