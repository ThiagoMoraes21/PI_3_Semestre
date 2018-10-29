package com.example.crmsolutionsproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping("/") //Define a url que quando for requisitada chamara o metodo
    public ModelAndView dashboard() {
        //Retorna a view que deve ser chamada
        return new ModelAndView("home.html");
    }
}

