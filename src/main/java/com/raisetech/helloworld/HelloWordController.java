package com.raisetech.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {

    @GetMapping("/hello")
    public String hello(){
        return "hello nakagawa";
    }
    @GetMapping("/user")
    public String name(){
        return "Nakagawa Yuuto";
    }
}
