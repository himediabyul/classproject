package com.manager.emp.controller;

import com.manager.emp.service.EmpDeleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class EmpDeleteController {
    @Autowired
    private EmpDeleteService empDeleteService;

    public void delete(int empno){
        empDeleteService.deleteE(empno);
    }
}
