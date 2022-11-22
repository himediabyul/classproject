package com.firstcoding.todo.service;

import com.firstcoding.todo.Util.ConnectionProvider;
import com.firstcoding.todo.dao.TodoDaoImpl;

import java.sql.Connection;

public class DeleteService {

    TodoDaoImpl dao = new TodoDaoImpl();

    public int delete(int tno) throws Exception{

        int result = 0;
        Connection conn = ConnectionProvider.getInstance().getConnection();

        result = dao.delete(conn, tno);

        return result;

    }
}
