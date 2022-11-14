package com.firstcoding.todo.service;

import com.firstcoding.todo.Util.ConnectionUtil;
import com.firstcoding.todo.dao.TodoDao;
import com.firstcoding.todo.domain.Todo;

import java.sql.Connection;

public class ReadService {

    private TodoDao dao = new TodoDao();

    public Todo read(int tno) throws Exception{

        Todo todo = null;
        Connection conn = ConnectionUtil.getInstance().getConnection();
        todo = dao.read(conn, tno);

        return todo;
    }
}
