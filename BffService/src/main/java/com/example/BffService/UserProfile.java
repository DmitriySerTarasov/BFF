package com.example.BffService;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.core.annotation.Order;

import java.util.List;

public class UserProfile {
    private SecurityProperties.User user;
    private List<Order> orders;
}
