package com.example.main.controller;

import com.example.main.dto.ItemDto;
import com.example.main.dto.ItemDtoSinger;
import com.example.main.dto.ItemDtoSoftlogic;
import com.example.main.service.ItemService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/web")
public class ItemController {

    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping("/abans")
    public List<ItemDto> getAllAbans() throws Exception {
      return itemService.getAllItemsAbans();
    }

    @GetMapping("/singer")
    public List<ItemDtoSinger> getAllSinger() throws Exception {
        return itemService.getAllItemsinger();
    }

    @GetMapping("/softlogic")
    public List<ItemDtoSoftlogic> getAllSoftlogic() throws Exception {
        return itemService.getAllItemsSoftlogic();
    }
}
