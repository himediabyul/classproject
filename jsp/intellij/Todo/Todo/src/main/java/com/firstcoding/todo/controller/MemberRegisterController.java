package com.firstcoding.todo.controller;

import com.firstcoding.todo.domain.MemberRegister;
import com.firstcoding.todo.service.MemberRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.IOException;

@Controller
@RequestMapping("/member/register")
public class MemberRegisterController {

    @Autowired
    private MemberRegisterService memberRegService;

    @GetMapping
    public String getmember(){
        return"member/member";
    }
    @PostMapping
    public String register(@Valid MemberRegister memberRegister, BindingResult bindingResult, HttpServletRequest request) throws Exception {

        if(bindingResult.hasErrors()){
            return "redirect:/todo/list";
        }

        memberRegService.memberReg(memberRegister, request);

        return "redirect:/index.jsp";

    }

}
