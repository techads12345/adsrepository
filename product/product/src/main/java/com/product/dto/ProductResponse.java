package com.product.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder

public class ProductResponse {

    private Integer id;
    private String productName;
    private double price;
    private int quantity;

    private Boolean isInStock;
}
