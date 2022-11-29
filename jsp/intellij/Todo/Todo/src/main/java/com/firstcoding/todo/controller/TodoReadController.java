package com.firstcoding.todo.controller;

import com.firstcoding.todo.service.ReadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

/*

import com.firstcoding.todo.domain.Todo;
import com.firstcoding.todo.service.ReadService;
import lombok.extern.log4j.Log4j2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "TodoReadController", value = "/todo/read")
@Log4j2
public class TodoReadController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        log.info("read get ...");

        ReadService service = new ReadService();

        String tno = request.getParameter("tno");

        Todo todo = null;

        try {
            todo = service.read(Integer.parseInt(tno));
        } catch (Exception e) {
//            throw new RuntimeException(e);
        }

        request.setAttribute("todo", todo);

        if(todo!= null) {

            RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/todo/read.jsp");
            dispatcher.forward(request, response);
        }

        */
/*System.out.println("read get...");

        // 사용자 요청 tno 받기
        String tno = request.getParameter("tno");
        System.out.println("요청 번호 : " + tno);

        // Service 요청한 tno로 할일 목록을 검색해서 결과 -> TodoDTO로 반환
        Todo todo = new Todo(1, "숙제", "2022-11-30", false);
        request.setAttribute("todo", todo);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/todo/read.jsp");
        dispatcher.forward(request, response);
*/
@Controller
public class TodoReadController {

    @Autowired
    private ReadService readService;
    @GetMapping("/todo/read")
    public void readTodo( Model model, @RequestParam("tno") int tno) {

        model.addAttribute("todo", readService.readtd(tno));

    }

}