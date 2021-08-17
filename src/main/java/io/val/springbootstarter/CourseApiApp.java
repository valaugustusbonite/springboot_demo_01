package io.val.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "io.val.springbootstarter","controller", "topic"} )
public class CourseApiApp {
    public static void main(String[] args) {
        SpringApplication.run(CourseApiApp.class, args);
    }
}
