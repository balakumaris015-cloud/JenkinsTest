package com.bala.JenkinsTest.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello Bala Kumar S, You are doing great!!! Good morning "+ new String(Character.toChars(0x1F349));
    }
}