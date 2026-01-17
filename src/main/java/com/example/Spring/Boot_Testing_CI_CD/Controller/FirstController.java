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

    @GetMapping("/web")
    public String webMessage() {
        return "New Welcome this is my First Message from the Application:";
    }

    @GetMapping("/web1")
    public String webMessage2() {
        return "New Welcome this is my First Message from the Application:";
    }

    @GetMapping("/web3")
    public String webMessage3() {
        return "New Welcome Web3";
    }







}
