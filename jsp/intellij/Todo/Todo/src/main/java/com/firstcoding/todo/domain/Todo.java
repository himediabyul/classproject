package com.firstcoding.todo.domain;

import lombok.*;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotEmpty;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Todo {

    private int tno ;

    @NotEmpty
    private String todo ;

    private String dueDate ;
    private boolean finished;
}
