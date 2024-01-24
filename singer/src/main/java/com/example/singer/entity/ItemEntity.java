package com.example.singer.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class ItemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "code")
    private int itemCode;

    @Column(name = "name")
    private String itemName;

    @Column(name = "price")
    private Long itemPrice;

    @Column(name = "branch")
    private String branch;
}
