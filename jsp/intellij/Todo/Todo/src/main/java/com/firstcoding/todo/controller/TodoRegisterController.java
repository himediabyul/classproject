/*
package com.firstcoding.todo.controller;

import com.firstcoding.todo.domain.Todo;
import com.firstcoding.todo.service.RegisterService;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "TodoRegiterController", value = "/todo/register")
@Log4j2
public class TodoRegiterController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        log.info("Todo Register get ...");

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/todo/register.jsp");
        dispatcher.forward(request, response);

    */
/*    // 사용자가 입력할 수 있는 폼 화면
        System.out.println("register get ...");

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/todo/register.jsp");
        dispatcher.forward(request, response);*//*

    }

    @SneakyThrows
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        RegisterService service = new RegisterService();

        // 사용자가 입력한 데이터를 받아서 처리
        System.out.println("register post ...");

        // 한글처리 : post
        request.setCharacterEncoding("utf-8");
        int tno = 0;
        String todo = request.getParameter("todo");
        String dueDate = request.getParameter("dueDate");

        System.out.println(todo);
        System.out.println(dueDate);

        int result = service.register(new Todo( tno ,todo, dueDate,false));
        if(result>0) {
            response.sendRedirect("/todo/list");
        }
    }
}
*/

package com.firstcoding.todo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/todo/register")
public class TodoRegisterController  {

    @GetMapping
    public String getRegister(HttpServletRequest request, HttpServletResponse response){

        return "/todo/register";
    }
    @PostMapping
    public String list(HttpServletRequest request, HttpServletResponse response){

        return "/todo/list";
    }
}