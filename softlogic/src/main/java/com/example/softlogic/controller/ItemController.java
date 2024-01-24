package com.example.softlogic.controller;

import com.example.softlogic.dto.ItemDtoSoftlogic;
import com.example.softlogic.service.ItemService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/items")
public class ItemController {

    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping("/getAll")
    public List<ItemDtoSoftlogic> getAllItems(){
        return itemService.getSoftlogicItems();
    }
}
