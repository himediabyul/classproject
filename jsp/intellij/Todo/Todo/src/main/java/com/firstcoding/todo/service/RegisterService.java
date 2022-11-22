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
public class RegisterService {

    @Autowired
    private TodoDaoImpl dao = new TodoDaoImpl();

    public int register(Todo todo) throws Exception{

        int result = 0;

        Connection conn = ConnectionProvider.getInstance().getConnection();

        result = dao.register(conn,todo);

        return result;
    }
}
