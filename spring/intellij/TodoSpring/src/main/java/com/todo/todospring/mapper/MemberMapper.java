package com.todo.todospring.mapper;

import com.todo.todospring.domain.Member;
import org.apache.ibatis.annotations.Mapper;

import java.sql.Connection;
import java.sql.SQLException;

@Mapper
public interface MemberMapper {

    // 회원 가입
    int insertMember(Member member) throws SQLException;


    Member selectByIdPw(String uid, String pw) throws SQLException;  // uid, pw 가 아닌 param1, param2 로 받음
}
