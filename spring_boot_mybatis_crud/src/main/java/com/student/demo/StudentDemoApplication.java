package com.student.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.student.demo.mapper")
public class StudentDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(StudentDemoApplication.class, args);
    }
}