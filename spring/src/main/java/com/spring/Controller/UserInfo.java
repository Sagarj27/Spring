package com.spring.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserInfo {

    @GetMapping(value = "/info")
    public String userInfo() {
        return "Hello world";
    }
}
