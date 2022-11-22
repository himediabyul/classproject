package com.firstcoding.todo.service;

import com.firstcoding.todo.Util.ConnectionProvider;
import com.firstcoding.todo.dao.TodoDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.sql.Connection;
@Repository
@Service
public class DeleteService {

    @Autowired
    TodoDaoImpl dao = new TodoDaoImpl();

    public int delete(int tno) throws Exception{

        int result = 0;
        Connection conn = ConnectionProvider.getInstance().getConnection();

        result = dao.delete(conn, tno);

        return result;

    }
}
