package com.example.main.service.impl;

import com.example.main.controller.WebClient;
import com.example.main.dto.ItemDto;
import com.example.main.dto.ItemDtoSinger;
import com.example.main.dto.ItemDtoSoftlogic;
import com.example.main.service.ItemService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class ItemServiceImpl implements ItemService {

    private final WebClient webClient;

    public ItemServiceImpl(WebClient webClient) {
        this.webClient = webClient;
    }

    @Override
    public List<ItemDto> getAllItemsAbans() throws Exception {

        log.info("hit getAll Abans Items");
        try {
            List<ItemDto> newList1 = new ArrayList<>();

            List<ItemDto> listDTO1 = webClient.getItemAbans();


            if (listDTO1.isEmpty()) {
                throw new Exception("Abans item empty");
            }

            newList1.addAll(listDTO1);

            return newList1;

        } catch (Exception e) {
            throw new Exception("Error occur during get abans item details");
        }
    }

    @Override
    public List<ItemDtoSinger> getAllItemsinger() throws Exception {

        log.info("hit getAll Singer Items");

        try {
            List<ItemDtoSinger> newList2 = new ArrayList<>();

            List<ItemDtoSinger> listDTO2 = webClient.getItemSinger();


            if (listDTO2.isEmpty()) {
                throw new Exception("Abans item empty");
            }

            newList2.addAll(listDTO2);

            return newList2;

        } catch (Exception e) {
            throw new Exception("Error occur during get abans item details");
        }
    }

    @Override
    public List<ItemDtoSoftlogic> getAllItemsSoftlogic() throws Exception {

        log.info("hit get all impl method");

        try {

            List<ItemDtoSoftlogic> newListSoftlogic = webClient.getItemSoftlogic();

            if (newListSoftlogic.isEmpty()){
                throw new Exception("unsuccessfull getiing data into impl method");
            }

            return newListSoftlogic;
        } catch (Exception e) {
            throw new Exception("cant get softlogic data");
        }
    }
}
