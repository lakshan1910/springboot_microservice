package com.example.singer.service;

import com.example.singer.dto.ItemDtoSinger;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ItemService {
    List<ItemDtoSinger> getSingerItems();
}
