package com.example.demo;

import com.example.demo.controller.CatController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.example.demo.repository")
public class DemoApplication {

    public static void main(String[] args)

    {
        SpringApplication.run(DemoApplication.class, args);


    }
}
