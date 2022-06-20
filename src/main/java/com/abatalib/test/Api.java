package com.abatalib.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Api {
    @GetMapping("/list")
    public String getList(){
        return "hello";
    }
}
