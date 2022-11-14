package com.firstcoding.todo.service;

import com.firstcoding.todo.Util.ConnectionUtil;
import com.firstcoding.todo.dao.TodoDao;

import java.sql.Connection;

public class DeleteService {

    TodoDao dao = new TodoDao();

    public int delete(int tno) throws Exception{

        int result = 0;
        Connection conn = ConnectionUtil.getInstance().getConnection();

        result = dao.delete(conn, tno);

        return result;

    }
}
