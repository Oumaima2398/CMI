package com.exemple.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CMIController {
    @RequestMapping("/")
    public String index() {
        return "Hello";
    }
}
