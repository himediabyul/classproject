package com.firstcoding.todo.service;

import com.firstcoding.todo.Util.ConnectionProvider;
import com.firstcoding.todo.dao.TodoDaoImpl;
import com.firstcoding.todo.domain.Todo;
import com.firstcoding.todo.mapper.TodoMapper;
import lombok.Cleanup;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Connection;

@Service
@Log4j2
public class ReadService {
 /*   @Autowired
    private static TodoDaoImpl dao = new TodoDaoImpl();*/
    @Autowired(required = false)
    private TodoMapper todoMapper;

    public Todo readtd(int tno){

        Todo todo = null;
//        @Cleanup Connection conn = ConnectionProvider.getInstance().getConnection();

        todo = todoMapper.read(tno);
        log.info(todo);

        return todo;
    }
}
