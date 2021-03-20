package com.example;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@RestController
@RequestMapping("/hello-world")
public class SpringGreetingController {

    public SpringGreetingController() {
    }

    @Inject
    RestProperties properties;

    @GetMapping
    public String hello() {
        return properties.getReplymsg();
    }
}
