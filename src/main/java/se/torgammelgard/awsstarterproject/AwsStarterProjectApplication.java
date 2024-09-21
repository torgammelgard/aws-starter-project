package se.torgammelgard.awsstarterproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class AwsStarterProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(AwsStarterProjectApplication.class, args);
    }

    @RestController
    @RequestMapping("test")
    public static class Foo {

        @GetMapping
        public String test() {
            return "Test worked!";
        }
    }
}
