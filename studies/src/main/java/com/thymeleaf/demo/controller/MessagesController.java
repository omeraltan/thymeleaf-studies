package com.thymeleaf.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MessagesController {

    @GetMapping("/messages")
    public String tasks(Model model){
        return "/messages";
    }

}
