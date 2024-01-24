package com.example.softlogic.service;

import com.example.softlogic.dto.ItemDtoSoftlogic;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ItemService {
    List<ItemDtoSoftlogic> getSoftlogicItems();
}
