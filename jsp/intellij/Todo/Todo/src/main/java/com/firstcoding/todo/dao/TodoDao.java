package com.firstcoding.todo.dao;

import com.firstcoding.todo.domain.Todo;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface TodoDao {

    // 전체 리스트 출력
    List<Todo> todoList(Connection conn) throws SQLException;

    // 하나의 항목 출력
    Todo read(Connection conn, int tno) throws SQLException;

    // 할일 등록
    int register(Connection conn, Todo dto) throws SQLException;

    // 할일 수정
    int modify(Connection conn, Todo dto) throws SQLException;

    // 할일 삭제
    int delete(Connection conn, int dto) throws SQLException;


}
