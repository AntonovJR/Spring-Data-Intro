package com.example.intro;

import com.example.intro.services.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class ConsoleRunner implements CommandLineRunner {
    private final UserService userService;


    public ConsoleRunner(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void run(String... args) {
        this.userService.register("Pesho", 25, new BigDecimal(1000));
    }
}
