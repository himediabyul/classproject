package com.firstcoding.todo.controller;

import com.firstcoding.todo.service.DeleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*

import com.firstcoding.todo.service.DeleteService;
import lombok.extern.log4j.Log4j2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "TodoRemoveController", value = "/todo/remove")
@Log4j2
public class TodoRemoveController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        DeleteService service = new DeleteService();

        log.info("todo remove ...");

        String tno = request.getParameter("tno");

        int result = 0;

        try {
            result = service.delete(Integer.parseInt(tno));
        } catch (Exception e) {
//            throw new RuntimeException(e);
        }

        if(result>0) {
            response.sendRedirect("/todo/list");
        }

      */
/*  System.out.println("todo remove ...");

        // 삭제하고자 하는 todo의 tno 값을 받는다
        String tno = request.getParameter("tno");
        System.out.println("삭제할 todo 번호 : " + tno);

        // Service로 tno 전달 -> Dao 해당 로우 삭제

        response.sendRedirect("/todo/list");*//*

    }
}
*/
@Controller
public class TodoRemoveController {
    @Autowired
    private DeleteService deleteService;

    @PostMapping("/todo/remove")
    public String deleteTodo(@RequestParam("tno") int tno) throws Exception {

        deleteService.delete(tno);

        return "redirect:/todo/list";
    }


}