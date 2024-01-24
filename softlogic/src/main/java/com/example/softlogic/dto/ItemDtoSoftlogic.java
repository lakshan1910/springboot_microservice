package com.example.softlogic.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ItemDtoSoftlogic {

    private int itemId;

    private String itemName;

    private String branch;

    private String price;

    private Long barcode;

    private Long discount;
}
