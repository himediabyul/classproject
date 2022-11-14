package com.firstcoding.todo.dao;

import com.firstcoding.todo.domain.Todo;
import lombok.Cleanup;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TodoDao {

    public List<Todo> todoList(Connection conn) throws SQLException {

        String sql = "Select * from todo";
        @Cleanup PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        List<Todo> list = new ArrayList<>();

            while (rs.next()){
                list.add(new Todo(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getBoolean(4)));
            }

        return list;
    }

    public int register(Connection conn, Todo todo) throws SQLException {

        int result = 0;
        PreparedStatement pstmt = null;

        String sql = "insert into todo values (?, ?, ?, ?)";

        pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, todo.getTno());
        pstmt.setString(2, todo.getTodo());
        pstmt.setString(3, todo.getDueDate());
        pstmt.setBoolean(4, todo.isFinished());

        result = pstmt.executeUpdate();

        return result;
    }

    public Todo read(Connection conn, int tno) throws SQLException {

        Todo todo = null;

        String sql = "Select * from todo where tno=?";
        @Cleanup PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, tno);

        ResultSet rs = pstmt.executeQuery();

        if(rs.next()){
            todo = rowToTodo(rs);
        }

        return todo;
    }
    private Todo rowToTodo(ResultSet rs) throws SQLException {
        return new Todo(rs.getInt("tno"), rs.getString("todo"), rs.getString("dueDate"), rs.getBoolean("finished"));
    }

    public int modify(Connection conn, Todo todo) throws SQLException{

        int result = 0;
        PreparedStatement pstmt = null;

        String sql = "update todo set todo=?, dueDate=?, finished=? where tno=?";

        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, todo.getTodo());
        pstmt.setString(2, todo.getDueDate());
        pstmt.setBoolean(3, todo.isFinished());
        pstmt.setInt(4,todo.getTno());

        result = pstmt.executeUpdate();

        return result;

    }

    public int delete(Connection conn, int tno) throws SQLException{

        int result = 0;
        PreparedStatement pstmt = null;

        String sql = "delete from todo where tno=?";

        pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, tno);

        result = pstmt.executeUpdate();

        return result;
    }


}
