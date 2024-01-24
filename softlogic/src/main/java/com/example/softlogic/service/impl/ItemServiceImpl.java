package com.example.softlogic.service.impl;

import com.example.softlogic.dto.ItemDtoSoftlogic;
import com.example.softlogic.entity.ItemEntity;
import com.example.softlogic.ripo.ItemRipository;
import com.example.softlogic.service.ItemService;
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
    public List<ItemDtoSoftlogic> getSoftlogicItems() {

        List<ItemEntity> itemList = itemRipository.findAll();
        List<ItemDtoSoftlogic> itemDtos = new ArrayList<>();

        itemList.forEach(itemEntity -> itemDtos.add(new ItemDtoSoftlogic(itemEntity.getItemId(),itemEntity.getItemName(),itemEntity.getBranch(),itemEntity.getPrice(),itemEntity.getBarcode(),itemEntity.getDiscount())));
        return itemDtos;
    }
}
