package com.firstcoding.todo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class LogoutController {

    @GetMapping("/logout")
    public String logout(HttpSession httpSession){

        httpSession.removeAttribute("loginInfo");

        return "redirect:/index.jsp";
    }
}
