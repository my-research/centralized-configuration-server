package com.tistory.wonit.configclientserver;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConfigClientServerApplication {

    @Value("${default.message}")
    private String message;


    @GetMapping("/")
    public String message() {
        return message;
    }

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientServerApplication.class, args);
    }

}
