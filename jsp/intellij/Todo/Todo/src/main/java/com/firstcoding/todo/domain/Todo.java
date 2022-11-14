package com.firstcoding.todo.domain;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Todo {

    private int tno ;
    private String todo ;
    private String dueDate ;
    private boolean finished;
}
