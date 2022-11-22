package com.firstcoding.todo.controller;
/*

import com.firstcoding.todo.domain.Todo;
import com.firstcoding.todo.service.ModifyService;
import com.firstcoding.todo.service.ReadService;
import lombok.extern.log4j.Log4j2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "TodoModifyController", value = "/todo/modify")
@Log4j2
public class TodoModifyController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        log.info("Todo modify get ...");

        ReadService service = new ReadService();

        String tno = request.getParameter("tno");

        Todo todo = null;

        try {
            todo = service.readtd(Integer.parseInt(tno));
        } catch (Exception e) {
//            throw new RuntimeException(e);
        }

        request.setAttribute("todo", todo);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/todo/modify.jsp");
        dispatcher.forward(request, response);

*/
/*

        System.out.println("modify get... ");

        // 사용자가 입력했던 데이터를 기본 값으로 가지는 입력 폼 화면
        String tno = request.getParameter("tno");
        System.out.println("사용자 요청 번호 : " + tno);

        // 수정 할 할일의 번호 받아서 Service에게 전달 -> TodoDTO 받는다
        TodoDTO todo = new TodoDTO(1,"숙제","2022-10-30",false);
        request.setAttribute("todo", todo);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/todo/modify.jsp");
        dispatcher.forward(request,response);
*//*



    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ModifyService service = new ModifyService();

        request.setCharacterEncoding("utf-8");
        String tno = request.getParameter("tno");
        String todo = request.getParameter("todo");
        String dueDate = request.getParameter("dueDate");
        String finished = request.getParameter("finished");

        int result = 0;

        try {
            result = service.modify(new Todo(Integer.parseInt(tno), todo, dueDate, finished==null ? false : true));
        } catch (Exception e) {
//            throw new RuntimeException(e);
        }

        if(result>0) {
           response.sendRedirect("/todo/list");
        }
        System.out.println("modify post ...");

   */
/*     // 사용자 입력한 데이터 모두 받기
        request.setCharacterEncoding("utf-8");
        String tno = request.getParameter("tno");
        String todo = request.getParameter("todo");
        String dueDate = request.getParameter("dueDate");
        String finished = request.getParameter("finished");


        System.out.println("tno" + tno);
        System.out.println("todo" + todo);
        System.out.println("dueDate" + dueDate);
        System.out.println("finished" + finished);

        // Service로 보낼 DTO 생성
        TodoDTO dto = new TodoDTO(Long.parseLong(tno), todo, dueDate, finished==null ? false : true);
        System.out.println(dto);

        // Service로 전송 -> 응답 int
        response.sendRedirect("/todo/list");*//*


    }
}

*/

import com.firstcoding.todo.domain.Todo;
import com.firstcoding.todo.service.ModifyService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/todo/modify")
@Controller
public class TodoModifyController{

//    @Autowired
    private final ModifyService modifyService;

    public TodoModifyController(ModifyService modifyService) {
        this.modifyService = modifyService;
    }

    @GetMapping
    public String getModify(Model model, @RequestParam("tno") int tno) {

        model.addAttribute("todo", modifyService.modifyTodo(tno));

        return "todo/modify";
    }

    @PostMapping
    public String modifytd(@RequestParam("tno") int tno,
                           @RequestParam("todo")String todo,
                           @RequestParam("dueDate")String dueDate,
                           @RequestParam(value = "finished", required = false)String finished) throws Exception {

        Todo td = new Todo(tno, todo, dueDate, finished == null ? false : true);

        service.modifyTodo(td);

        return "redirect:/todo/list";
    }

    }