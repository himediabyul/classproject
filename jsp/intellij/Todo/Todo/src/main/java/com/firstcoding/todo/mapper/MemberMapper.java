package com.firstcoding.todo.mapper;

import com.firstcoding.todo.domain.Member;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {

    int insertMember(Member member);

    Member selectId(String uid, String pw);

}
