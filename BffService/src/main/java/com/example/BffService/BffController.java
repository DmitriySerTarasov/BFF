package com.example.BffService;


import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;
@RestController
@RequestMapping("/api/site-bff")
public class BffController {
    private UserProfile getUserProfile(@PathVariable Long userId) {
        User user = restTemplate.getForObject(
                "http://locast:8081/api/users/{userId}",
                User.class,
                userId
        );
        List<order> orders = restTemplate.getForObject(
                "http://localhost:8082/api/orders/by-user/{userId}",
                List.class,
                userId
        );
        return new UserProfile(user, orders);
    }

}
