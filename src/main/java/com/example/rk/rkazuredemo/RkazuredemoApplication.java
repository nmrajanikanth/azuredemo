package com.example.rk.rkazuredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RkazuredemoApplication {

    @GetMapping("/message")
    public String message(){
        return "Hi from Azure";
    }
    public static void main(String[] args) {
        SpringApplication.run(RkazuredemoApplication.class, args);
    }

}
