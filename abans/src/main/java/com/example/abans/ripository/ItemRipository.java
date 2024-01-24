package com.example.abans.ripository;

import com.example.abans.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRipository extends JpaRepository<Item,Integer> {

}
