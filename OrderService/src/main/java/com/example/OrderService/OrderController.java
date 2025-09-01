package com.example.OrderService;


import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
    @GetMapping("/by-user/{userId}")
    public List<Order> getOrdersByUser(@PathVariable Long userId) {
        return List.of(
                new Order(1L, userId, BigDecimal.valueOf(1000), "RUB", List.of("Ноутбук", "Мышь")),
        new Order(2L, userId, BigDecimal.valueOf(500), "RUB", List.of("клавиатура"))
        );
    }
}
