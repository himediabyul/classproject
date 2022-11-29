package com.firstcoding.todo.service;

import com.firstcoding.todo.Util.ConnectionProvider;
import com.firstcoding.todo.dao.TodoDaoImpl;
import com.firstcoding.todo.mapper.TodoMapper;
import lombok.Cleanup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Connection;
@Service
public class DeleteService {

    /*@Autowired
    TodoDaoImpl dao = new TodoDaoImpl();*/

    @Autowired(required = false)
    private TodoMapper todoMapper;

    public int delete(int tno) throws Exception{

        int result = 0;
//        @Cleanup Connection conn = ConnectionProvider.getInstance().getConnection();

        result = todoMapper.delete(tno);

        return result;

    }
}
