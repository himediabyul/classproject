package com.app.board.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface BoardRepository extends JpaRepository<Board, Integer> {

    // 리스트 불러오기
    @Query("select b from Board b ")
    List<Board> findAll();


}
