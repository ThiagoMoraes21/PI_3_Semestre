package com.example.crmsolutionsproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    // Define esse arquivo como root path
    @RequestMapping("/")
    public ModelAndView dashboard() {
        //Retorna a view que deve ser renderizada no browser
        return new ModelAndView("home.html");
    }
}

