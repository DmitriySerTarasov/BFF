package com.example.OrderService;

import java.math.BigDecimal;
import java.util.List;

public class Order {
    private Long id;
    private Long userId;
    private BigDecimal amount;
    private String currency;
    private List<String> items;


    public <E> Order(long l, Long userId, BigDecimal bigDecimal, String rub, java.util.List<E> items) {
    }
}
