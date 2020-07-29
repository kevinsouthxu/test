package com.example.demo.controller;
import org.springframework.web.bind.annotation.*;
@CrossOrigin
@RestController
public class TestController {
    @RequestMapping("/test")
    public String test() {
        return "Hello I'm you father";
    }
}
