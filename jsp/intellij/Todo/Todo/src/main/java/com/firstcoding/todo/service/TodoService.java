package com.firstcoding.todo.service;

import com.firstcoding.todo.Util.ConnectionUtil;
import com.firstcoding.todo.dao.TodoDao;
import com.firstcoding.todo.domain.Todo;
import lombok.Cleanup;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.util.List;
@Log4j2
public class TodoService {


    private TodoDao dao = new TodoDao();

    public List<Todo> getList() throws Exception {

        log.info("TodoService getList() ...");

        @Cleanup Connection conn = ConnectionUtil.getInstance().getConnection();

        List<Todo> list = dao.todoList(conn);

        log.info(list);
        return list;
    }
    /*public List<TodoDTO> getTodoList() {

        List<TodoDTO> list = new ArrayList<>();

        for(int i=0; i<10; i++) {
            list.add(new TodoDTO(i+1, "todo " + i, "2022-12-25", false));

        }
        return list;

    }*/


}
