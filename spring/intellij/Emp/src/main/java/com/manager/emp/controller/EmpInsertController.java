package com.manager.emp.controller;

import com.manager.emp.domain.EmpDTO;
import com.manager.emp.service.EmpInsertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/emp/insert")
public class EmpInsertController {

    @Autowired
    private EmpInsertService empInsertService;

    @GetMapping
    public void getInsertForm(){
    }

    @PostMapping
    public String insertE(EmpDTO empDTO){

        empInsertService.insert(empDTO);

        return "redirect:/emp/list";
}
}
