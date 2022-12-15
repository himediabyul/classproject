package com.app.board.entity;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Entity
@Table(name = "tbl_reply")
public class Reply {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int rno;

    @Column
    private int bno;

    @Column
    private String reply;

    @Column
    private String replyer;

    @Column
    private String replyDate;

    @Column
    private String updateDate;
}
