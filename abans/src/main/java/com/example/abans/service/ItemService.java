package com.example.abans.service;

import com.example.abans.dto.ItemDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ItemService {
    List<ItemDto> getAllItemAbans();
}
