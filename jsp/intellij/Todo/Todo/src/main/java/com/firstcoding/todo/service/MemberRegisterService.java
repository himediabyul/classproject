package com.firstcoding.todo.service;

import com.firstcoding.todo.Util.ConnectionProvider;
import com.firstcoding.todo.dao.MemberDao;
import com.firstcoding.todo.domain.Member;
import com.firstcoding.todo.domain.MemberRegister;
import lombok.Cleanup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.sql.Connection;

@Service
public class MemberRegisterService {

    @Autowired
    private MemberDao memberDao;

    public int memberReg(MemberRegister memberRegister, HttpServletRequest request) throws Exception {

        String newFileName = null;

        if(memberRegister.getUphoto() != null){

            String dirUri = "/uploadPhoto";

            String dirRealpath = request.getSession().getServletContext().getRealPath(dirUri);

            newFileName = System.currentTimeMillis() + memberRegister.getUphoto().getOriginalFilename();


            memberRegister.getUphoto().transferTo(new File(dirRealpath, newFileName));

        }
        Member member = memberRegister.toMember();

        if(newFileName != null){
            member.setUphoto(newFileName);
        }

        @Cleanup Connection conn = ConnectionProvider.getInstance().getConnection();

        return memberDao.insertMember(conn, member);
    }
}
