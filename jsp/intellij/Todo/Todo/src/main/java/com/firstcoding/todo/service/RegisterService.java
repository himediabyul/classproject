package com.firstcoding.todo.service;

import com.firstcoding.todo.Util.ConnectionUtil;
import com.firstcoding.todo.dao.TodoDao;
import com.firstcoding.todo.domain.Todo;

import java.sql.Connection;
import java.util.List;

public class RegisterService {

    private TodoDao dao = new TodoDao();

    public int register(Todo todo) throws Exception{

        int result = 0;

        Connection conn = ConnectionUtil.getInstance().getConnection();

        result = dao.register(conn,todo);

        return result;
    }
}
