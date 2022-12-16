package com.app.board.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
@Entity
@Table(name = "tbl_board")
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer bno;

    @Column
    private String title;

    @Column
    private String content;

    @Column(updatable = false)
    private String writer;

    @Column
    private String photo;

    @Column(insertable = false, updatable = false) // 테이블에서 자동입력되기때문에 입력 및 업데이트 불가 처리
    private LocalDate regdate;

    @Column(insertable = false)
    private LocalDate updatedate;



}