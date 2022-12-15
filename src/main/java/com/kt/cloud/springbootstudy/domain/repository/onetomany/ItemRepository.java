package com.kt.cloud.springbootstudy.domain.repository.onetomany;

import com.kt.cloud.springbootstudy.domain.entity.onetomany.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ItemRepository extends JpaRepository<Item, String> {
}
