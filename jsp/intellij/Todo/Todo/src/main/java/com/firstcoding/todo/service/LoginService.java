package com.firstcoding.todo.service;

import com.firstcoding.todo.Util.ConnectionProvider;
import com.firstcoding.todo.dao.MemberDao;
import com.firstcoding.todo.domain.Member;
import lombok.Cleanup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Connection;

@Service
public class LoginService {
    @Autowired
    private MemberDao memberDao;

    public Member loginMember(String uid, String pw) throws Exception {

       @Cleanup Connection conn = ConnectionProvider.getInstance().getConnection();

       return memberDao.selectId (conn, uid, pw);

    }
}
