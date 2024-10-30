package com.example.userdetailsapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//@SpringBootApplication
@SpringBootApplication(scanBasePackages = "com.example.userdetailsapp")
public class UserDetailAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserDetailAppApplication.class, args);
    }

}