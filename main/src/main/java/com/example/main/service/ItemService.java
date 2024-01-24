package com.example.main.service;

import com.example.main.dto.ItemDto;
import com.example.main.dto.ItemDtoSinger;
import com.example.main.dto.ItemDtoSoftlogic;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ItemService {
    List<ItemDto> getAllItemsAbans() throws Exception;

    List<ItemDtoSinger> getAllItemsinger() throws Exception;

    List<ItemDtoSoftlogic> getAllItemsSoftlogic() throws Exception;
}
