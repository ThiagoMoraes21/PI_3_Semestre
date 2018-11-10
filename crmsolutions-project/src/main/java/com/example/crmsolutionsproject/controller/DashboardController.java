package com.example.crmsolutionsproject.controller;

import com.example.crmsolutionsproject.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DashboardController {
    //  Define a url de requisição da dashboard
    @RequestMapping("/dashboard")
    public ModelAndView dashboard() {
        //Retorna a view que deve ser renderizada no browser
        return new ModelAndView("dashboard.html");
    }

    @MessageMapping("/dashboard.sendMessage")
    @SendTo("/topic/public/dash")
    public ChatMessage sendMessage(@Payload ChatMessage chatMessage) {
        return chatMessage;
    }

    @MessageMapping("/dashboard.addUser")
    @SendTo("/topic/public/dash")
    public ChatMessage addUser(@Payload ChatMessage chatMessage, SimpMessageHeaderAccessor headerAccessor) {
        // Add username em uma sessão websocket
        headerAccessor.getSessionAttributes().put("username", chatMessage.getSender());
        return chatMessage;
    }
}
