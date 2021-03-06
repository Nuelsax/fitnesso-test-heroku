package com.decagon.fitnessoapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductRequestDto {
    private String category;
    private String productName;
    private BigDecimal price;
    private String description;
    private String productType;
    private String image;
    private Integer durationInHoursPerDay;
    private Integer durationInDays;
    private Integer quantity;
    private Long stock; //fixme
}

