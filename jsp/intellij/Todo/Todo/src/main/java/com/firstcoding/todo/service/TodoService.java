package com.firstcoding.todo.service;

import com.firstcoding.todo.Util.ConnectionProvider;
import com.firstcoding.todo.dao.TodoDaoImpl;
import com.firstcoding.todo.domain.Todo;
import com.firstcoding.todo.mapper.TodoMapper;
import lombok.Cleanup;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.util.List;
@Log4j2
@Repository
@Service
public class TodoService {

/*    @Autowired
    private TodoDaoImpl dao = new TodoDaoImpl();*/

    @Autowired(required = false)
    private TodoMapper todoMapper;

    public List<Todo> getList() throws Exception {

        log.info("TodoService getList() ...");

//        @Cleanup Connection conn = ConnectionProvider.getInstance().getConnection();

        List<Todo> list = null;

        list = todoMapper.todoList();

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
