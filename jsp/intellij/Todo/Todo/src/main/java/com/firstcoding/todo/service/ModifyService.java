package com.firstcoding.todo.service;

import com.firstcoding.todo.Util.ConnectionUtil;
import com.firstcoding.todo.dao.TodoDao;
import com.firstcoding.todo.domain.Todo;

import java.sql.Connection;

public class ModifyService {

    private TodoDao dao = new TodoDao();

    public int modify(Todo todo) throws Exception{

        int result = 0;

        Connection conn = ConnectionUtil.getInstance().getConnection();
        result = dao.modify(conn, todo);

        return result;

    }
}
