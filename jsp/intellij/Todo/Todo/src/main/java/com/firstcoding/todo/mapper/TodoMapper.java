package com.firstcoding.todo.mapper;

import com.firstcoding.todo.domain.Todo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface TodoMapper {

    // 전체리스트
    @Select("select * from todo")
    List<Todo> todoList();

    // Todo 등록
    int register(Todo todo);

    // Todo 개별읽기
    @Select("select * from todo where tno=#{tno}")
    Todo read(int tno);

    // Todo 수정
    int modify(Todo todo);

    // Todo 삭제
    int delete(int tno);
}
