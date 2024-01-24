package com.example.main.controller;

import com.example.main.dto.ItemDto;
import com.example.main.dto.ItemDtoSinger;
import com.example.main.dto.ItemDtoSoftlogic;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
@Slf4j
public class WebClient {

    public List<ItemDto> getItemAbans(){

        log.info("starting get abans data");
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("http://localhost:8080/api/v1/items/getAll" + "", List.class);
    }

    public List<ItemDtoSinger> getItemSinger(){

        log.info("starting get singer data");
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("http://localhost:8082/api/v1/items/getAll" + "", List.class);
    }

    public List<ItemDtoSoftlogic> getItemSoftlogic(){
        log.info("startng get softlogeic data");
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("http://localhost:8084/api/v1/items/getAll" + "", List.class);
    }
}
