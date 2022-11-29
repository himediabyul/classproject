package com.app.manager.controller.rest;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/mc/simple")
@Log4j2
public class SimpleConverterController {

    @GetMapping
    public void form(){
        log.info("form...");
    }

    @PostMapping
    @ResponseBody // 문자열로 응답
    public String simple(@RequestBody String body){ // body안에 문자열을 받아서 전달
        log.info("body>>>>>>>>" + body);

    return "body>>>>>>>>" + body;
    }
}
