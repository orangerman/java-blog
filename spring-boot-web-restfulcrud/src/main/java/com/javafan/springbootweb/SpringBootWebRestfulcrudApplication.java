package com.javafan.springbootweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

@SpringBootApplication
public class SpringBootWebRestfulcrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootWebRestfulcrudApplication.class, args);
    }

}