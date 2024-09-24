package se.torgammelgard.awsstarterproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/api/test")
    String testMessage() {
        return "Hello from backend";
    }
}
