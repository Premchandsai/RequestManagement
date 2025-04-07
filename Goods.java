package com.gdc.request_management.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "goods", schema = "gdc-db")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Goods {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "goods_id")
    private Long goodsId;

    @Column(name = "description", nullable = false, length = 255)
    private String goodsdescription; // Fixed naming from goodsdescription to description

    @Column(name = "weight", nullable = false)
    private Double weight;

    @Column(name = "volume")
    private Double volume;

    @Column(name = "quantity", nullable = false)
    private Integer quantity; // New column for number of items

    @Column(name = "is_fragile", nullable = false)
    private Boolean isFragile; // New column to indicate if goods are fragile (true) or normal (false)
}