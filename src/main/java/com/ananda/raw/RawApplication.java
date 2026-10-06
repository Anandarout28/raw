package com.ananda.raw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RawApplication {

    public static void main(String[] args) {
        System.setProperty("user.timezone", "Asia/Kolkata");
        SpringApplication.run(RawApplication.class, args);
        System.out.println("Spring application Started!");
    }

}
