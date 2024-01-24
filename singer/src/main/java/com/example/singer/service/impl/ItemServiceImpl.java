package com.example.singer.service.impl;

import com.example.singer.dto.ItemDtoSinger;
import com.example.singer.entity.ItemEntity;
import com.example.singer.ripo.ItemRipository;
import com.example.singer.service.ItemService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    private final ItemRipository itemRipository;

    public ItemServiceImpl(ItemRipository itemRipository) {
        this.itemRipository = itemRipository;
    }

    @Override
    public List<ItemDtoSinger> getSingerItems() {

        List<ItemEntity> itemList = itemRipository.findAll();
        List<ItemDtoSinger> itemDtos = new ArrayList<>();

        itemList.forEach(itemEntity -> itemDtos.add(new ItemDtoSinger(itemEntity.getId(),itemEntity.getItemCode(),itemEntity.getItemName(),itemEntity.getItemPrice(),itemEntity.getBranch())));
        return itemDtos;
    }
}
