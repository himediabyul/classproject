package com.firstcoding.todo.dao;

import com.firstcoding.todo.domain.Todo;
import lombok.Cleanup;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository(value = "todoDao")
public class TodoDaoImpl implements TodoDao {

    @Override
    public List<Todo> todoList(Connection conn) throws SQLException {

        String sql = "select * from todo";
        @Cleanup PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        List<Todo> list = new ArrayList<>();

            while (rs.next()){
                list.add(new Todo(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getBoolean(4)));
            }

        return list;
    }

    @Override
    public int register(Connection conn, Todo todo) throws SQLException {

        String sql = "insert into todo values (?, ?, ?, ?)";

        @Cleanup PreparedStatement pstmt = conn.prepareStatement(sql);

        pstmt.setInt(1, todo.getTno());
        pstmt.setString(2, todo.getTodo());
        pstmt.setString(3, todo.getDueDate());
        pstmt.setBoolean(4, todo.isFinished());

        int result = pstmt.executeUpdate();

        return result;
    }

    @Override
    public Todo read(Connection conn, int tno) throws SQLException {

        Todo todo = null;

        String sql = "select * from todo where tno=?";
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

    @Override
    public int modify(Connection conn, Todo todo) throws SQLException{

        String sql = "update todo set todo=?, dueDate=?, finished=? where tno=?";

        @Cleanup PreparedStatement pstmt = conn.prepareStatement(sql);

        pstmt.setString(1, todo.getTodo());
        pstmt.setString(2, todo.getDueDate());
        pstmt.setBoolean(3, todo.isFinished());
        pstmt.setInt(4,todo.getTno());

        int result = pstmt.executeUpdate();

        return result;

    }
    @Override
    public int delete(Connection conn, int tno) throws SQLException{

        String sql = "delete from todo where tno=?";

        @Cleanup PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, tno);

        int result = pstmt.executeUpdate();

        return result;
    }


}
