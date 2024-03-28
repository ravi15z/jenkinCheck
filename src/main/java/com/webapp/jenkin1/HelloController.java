package com.webapp.jenkin1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String helloMethod() {
        return "Hello Jenkin";
    }
}
