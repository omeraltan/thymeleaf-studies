package com.thymeleaf.demo.controller;

import com.thymeleaf.demo.model.Teacher;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/api/teachers")
public class TeacherController {

    @GetMapping
    public String getAllTeachers(Model model){
        model.addAttribute("teachers", fetchTeachers());
        return "teacher-list";
    }


    private List<Teacher> fetchTeachers(){
        return Arrays.asList(
            new Teacher("Male",true, "Turkish", "Music", 24),
            new Teacher("Female",true,"Turkish", "English",52),
            new Teacher("Male",true, "English", "Maths",23),
            new Teacher("Male",false, "Maths", "Music",12)
        );
    }
}
