package com.firstcoding.todo.service;

import com.firstcoding.todo.Util.ConnectionProvider;
import com.firstcoding.todo.dao.TodoDaoImpl;
import com.firstcoding.todo.domain.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Connection;

@Repository
public class ReadService {

    @Autowired
    private static TodoDaoImpl dao = new TodoDaoImpl();

    public static Todo readtd(int tno) throws Exception{

        Todo todo = null;
        Connection conn = ConnectionProvider.getInstance().getConnection();
        todo = dao.read(conn, tno);

        return todo;
    }
}
