package com.example.abans.service.impl;

import com.example.abans.dto.ItemDto;
import com.example.abans.entity.Item;
import com.example.abans.ripository.ItemRipository;
import com.example.abans.service.ItemService;
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
    public List<ItemDto> getAllItemAbans() {
        List<Item> itemList = itemRipository.findAll();
        List<ItemDto> itemDto = new ArrayList<>();
        itemList.forEach(
                item -> itemDto.add(new ItemDto(item.getId(), item.getBrand(), item.getName(), item.getPrice())));
        return itemDto;
    }
}
