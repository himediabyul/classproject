package com.firstcoding.todo.controller;
/*
package com.firstcoding.todo.controller;

import com.firstcoding.todo.domain.Todo;
import com.firstcoding.todo.service.TodoService;
import lombok.extern.log4j.Log4j2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "TodoListController", value = "/todo/list")
@Log4j2
public class TodoListController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        log.info("Todo List Get ...");

        TodoService service = new TodoService();

        List<Todo> list = null;

        try {
            list = service.getList();
        } catch (Exception e) {
//            throw new RuntimeException(e);
        }

        request.setAttribute("list", list);

        RequestDispatcher dispatcher  = request.getRequestDispatcher("/WEB-INF/todo/list.jsp");
        dispatcher.forward(request, response);



      */
/*  System.out.println("todo list ...");

        // 출력 결과
//        String title = "Todo List" ;
        request.setAttribute("title", "Todo List");
        request.setAttribute("todolist", new TodoService().getTodoList());

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/todo/list.jsp");
        dispatcher.forward(request, response);*//*

    }

}
*/

import com.firstcoding.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TodoListController{

    @Autowired
    private TodoService service = new TodoService();

    @RequestMapping("/todo/list")
    public String list(Model model) throws Exception {

        model.addAttribute("todoList", service.getList());

        return "todo/list";
    }

}