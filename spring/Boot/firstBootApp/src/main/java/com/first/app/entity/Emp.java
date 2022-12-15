package com.first.app.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "emp")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Emp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 자동증가값 설정
    @Column
    private Integer empno;

    @Column
    private String ename;

    @Column
    private String job;

    @Column
    private Integer mgr;  // int는 null 이 발생하면 문제가 생김 Integer로 지정

    @Column
    private LocalDate hiredate;

    @Column
    private Double sal;

    @Column
    private Double comm;

/*    @Column
    private Integer deptno;*/

    @JoinColumn(name = "deptno") // join 조건
    @ManyToOne  // join
    private Dept dept;

}
