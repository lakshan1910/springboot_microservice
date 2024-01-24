package com.example.main.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ItemDtoSinger {

    private int id;
    private int itemCode;
    private String itemName;
    private Long itemPrice;
    private String branch;
}
