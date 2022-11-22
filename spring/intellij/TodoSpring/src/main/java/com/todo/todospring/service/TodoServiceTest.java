package com.todo.todospring.service;

import com.todo.todospring.dao.TodoDaoTest;
import com.todo.todospring.domain.TodoDTO;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
public class TodoServiceTest {

//    @Autowired
    private final TodoDaoTest dao;

    public TodoServiceTest(TodoDaoTest dao) {
        this.dao = dao;
    }

    public void test(){
        log.info("TodoService.test() 메소드가 실행 되었습니다.");
        dao.selectAll();
    }

    public List<TodoDTO> getList(){

    List<TodoDTO> list = null;

    return list;
    }
}
