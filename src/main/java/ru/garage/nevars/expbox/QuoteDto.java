package ru.garage.nevars.expbox;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class QuoteDto {

    private String symbol;

    private String provider;

    private String tier;

    private BigDecimal bid;

    private BigDecimal offer;
}
