package com.jdk17.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.jdk17")
public class JavaSeventeenProject {

    public static void main(String[] args) {
        SpringApplication.run(JavaSeventeenProject.class, args);
    }
}
