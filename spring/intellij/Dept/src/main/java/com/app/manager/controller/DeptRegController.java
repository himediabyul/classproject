package com.app.manager.controller;

import com.app.manager.domain.DeptDTO;
import com.app.manager.service.DeptRegService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Log4j2
@Controller
@RequestMapping("/dept/register")
public class DeptRegController {

    @Autowired
    private DeptRegService deptRegService;

    @GetMapping
    public void getRegForm(){

    }
    @Autowired
    private DeptRegService regService;
    @PostMapping
    public String reg(DeptDTO deptDTO,
                      BindingResult bindingResult){

        log.info("reg Post..." + deptDTO);

        if(bindingResult.hasErrors()){
            log.info(bindingResult.getAllErrors());
            for(ObjectError objectError : bindingResult.getAllErrors()){
                log.info(objectError.getCodes()[1] + " : " + objectError.getDefaultMessage());
            }
        }

        regService.insertDept(deptDTO);
        //regService.insertDepts(deptDTO);

        return "redirect:/dept/list";
    }

}
