package com.thash.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class WebAppApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(WebAppApplication.class, args);


    }

}
