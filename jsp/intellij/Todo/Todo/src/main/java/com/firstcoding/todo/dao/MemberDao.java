package com.firstcoding.todo.dao;

import com.firstcoding.todo.domain.Member;

import java.sql.Connection;
import java.sql.SQLException;

public interface MemberDao {

    int insertMember(Connection conn, Member member) throws SQLException;

    Member selectId(Connection conn, String uid, String pw) throws SQLException;

}
