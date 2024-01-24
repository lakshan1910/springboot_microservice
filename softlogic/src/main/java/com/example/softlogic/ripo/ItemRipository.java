package com.example.softlogic.ripo;

import com.example.softlogic.entity.ItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRipository extends JpaRepository<ItemEntity, Integer> {
}
