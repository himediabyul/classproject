package com.firstcoding.mvc.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SampleController {

    @RequestMapping("/sample")
    public ModelAndView getSamplePage(){

        ModelAndView mav = new ModelAndView();
        mav.setViewName("sample"); // => /WEB-INF/view/sample.jsp

        return mav;
    }
    @RequestMapping("/sample2")
    public String getStringPage(){
        return "sample2"; // /WEB-INF/views/sample2.jsp
    }

    @RequestMapping("/sample3")
    public void getVoidPage(){
    }

    @RequestMapping("/sample4")
    @ResponseBody  // jsp 없이 출력, 메서드 반환타입
    public String page(){
        return "Y";
    }

    @RequestMapping("/sample5")
    @ResponseBody  // 주소에 ? 조건을 줘야함
    public String page2(int num){

        String str = null;
        str.trim();
        return String.valueOf(num);
    }
}
