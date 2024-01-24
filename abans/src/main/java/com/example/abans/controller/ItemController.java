package com.example.abans.controller;

import com.example.abans.dto.ItemDto;
import com.example.abans.service.ItemService;
import org.springframework.web.bind.annotation.*;

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
    public List<ItemDto> getAllItemAbans(){
        return itemService.getAllItemAbans();

    }
}
