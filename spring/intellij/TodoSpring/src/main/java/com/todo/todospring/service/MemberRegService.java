package com.todo.todospring.service;

import com.todo.todospring.dao.MemberDao;
import com.todo.todospring.domain.Member;
import com.todo.todospring.domain.MemberRegRequest;
import com.todo.todospring.mapper.MemberMapper;
import com.todo.todospring.util.ConnectionProvider;
import lombok.Cleanup;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;

@Log4j2
@Service
public class MemberRegService {

    @Autowired
    private MemberMapper memberMapper;
/*

    @Autowired
    private MemberDao memberDao;  // DaoImpl에 Repository 처리해서 bean생성
*/

    // 사용자 요청 데이터를 받고 파일 업로드 처리, Dao insert 요청
    public int memberReg(MemberRegRequest regRequest, HttpServletRequest request) throws Exception {

        String newFileName = null;

        // 파일 업로드 처리 여부 체크
        if(regRequest.getUphoto() != null
                && !regRequest.getUphoto().isEmpty()
                && regRequest.getUphoto().getSize()>0){ // null 이 아니고, 비어있지 않고, 사이즈가 0보다 큰 조건

            // uri 정의 : 저장할 폴더
            String dirURi = "/uploadfile/member";
            // 시스템의 절대 경로
            String dirRealpath = request.getSession().getServletContext().getRealPath(dirURi);
            log.info(dirRealpath);

            newFileName = System.currentTimeMillis() + regRequest.getUphoto().getOriginalFilename();  // 원본파일이름에 밀리초를 붙여 중복되지 않게!
            log.info(newFileName);


            // 저장 처리
            try {
                regRequest.getUphoto().transferTo(new File(dirRealpath, newFileName));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

        Member member = regRequest.toMember();

        if(newFileName != null){
            member.setUphoto(newFileName);
        }

        log.info(member);

//        @Cleanup Connection conn = ConnectionProvider.getInstance().getConnection();

        return memberMapper.insertMember(member);
    }


}
