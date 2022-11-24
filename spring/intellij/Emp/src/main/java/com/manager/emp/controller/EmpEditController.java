package com.manager.emp.controller;

import com.manager.emp.domain.EmpDTO;
import com.manager.emp.service.EmpEditService;
import com.manager.emp.service.EmpReadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/emp/edit")
public class EmpEditController {

    @Autowired
    private EmpReadService empReadService;
    @GetMapping
    public String getEditForm(int empno, Model model){

        model.addAttribute("editEmp", empReadService.readEmp(empno));

        return "/emp/edit";
    }

    @Autowired
    private EmpEditService empEditService;

    @PostMapping
    public String edit(EmpDTO empDTO){

        empEditService.editE(empDTO);

        return "redirect:/emp/list";
    }

}
