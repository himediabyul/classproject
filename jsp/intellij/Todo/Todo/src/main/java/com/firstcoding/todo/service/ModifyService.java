package com.firstcoding.todo.service;

import com.firstcoding.todo.Util.ConnectionProvider;
import com.firstcoding.todo.dao.TodoDaoImpl;
import com.firstcoding.todo.domain.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.sql.Connection;

@Service
@Repository
public class ModifyService {

    @Autowired
    private TodoDaoImpl dao = new TodoDaoImpl();

    public int modifyTodo(Todo todo) throws Exception{

        int result = 0;

        Connection conn = ConnectionProvider.getInstance().getConnection();
        result = dao.modify(conn, todo);

        return result;

    }

 }
