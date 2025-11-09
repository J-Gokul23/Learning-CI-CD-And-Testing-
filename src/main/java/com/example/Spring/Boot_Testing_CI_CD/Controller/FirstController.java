package com.example.Spring.Boot_Testing_CI_CD.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FirstController {


    @GetMapping("/message")
    public String firstMessage() {
        return "New Welcome this is my First Message from the Application:";
    }

    @GetMapping("/second")
    public String secondMessage() {
        return "Welcome Gokul Nath";
    }
}
