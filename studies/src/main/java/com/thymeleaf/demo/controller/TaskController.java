package com.thymeleaf.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TaskController {

    @Value("${countries}")
    private List<String> countries;

    @GetMapping("/task")
    public String tasks(Model model){

        model.addAttribute("countries",countries);
        return "/task";
    }

}
