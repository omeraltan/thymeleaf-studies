package com.thymeleaf.demo.controller;

import com.thymeleaf.demo.model.Article;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/api/articles")
public class ArticlesController {

    @GetMapping
    public String allArticles(Model model){
        model.addAttribute("articles", fetchArticles());
        return "articles-list";
    }

    private List<Article> fetchArticles(){
        return Arrays.asList(
            new Article("Introduction to Using Thyemealf in Spring", "https://www.omer.com/thymeleaf-in-spring-mvc"),
            new Article("Thyemealf in Spring", "https://www.omer.com/thymeleaf-in-spring"),
            new Article("Introduction to Thyemealf", "https://www.omer.com/thymeleaf-in-intro"),
            new Article("Thyemealf vs Mustache", "https://www.omer.com/thymeleaf-vs-mustache")
        );
    }

}
