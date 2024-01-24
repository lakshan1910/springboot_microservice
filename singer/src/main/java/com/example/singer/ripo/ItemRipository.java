package com.example.singer.ripo;

import com.example.singer.entity.ItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRipository extends JpaRepository<ItemEntity,Integer> {
}
