package com.example.UserService;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @GetMapping("/{userId}")
    public User getUser(@PathVariable long userId) {
        return new User(userId, "Иван Иванов", "ул.Ленина 1", "+79991234567", "ivan@example.com");
    }

}
