import React, {useEffect, useState} from 'react';
import {getTodoList} from "../../apis/todoAPI";
import {Table, TableBody, TableCell, TableHead, TableRow} from "@mui/material";

function TodoListComponent({query, moveToRead}) {

    const [todos, setTodos] = useState([])

    useEffect(() => {
        getTodoList().then(result => {
            setTodos(result)
        })
    }, [query])

    return (
       <>
           <Table sx={{minWidth: 650}} aria-label= "simple table">
               <TableHead>
                   <TableRow>
                       <TableCell align={"right"}>ID</TableCell>
                       <TableCell align={"right"}>Title</TableCell>
                       <TableCell align={"right"}>Writer</TableCell>
                       <TableCell align={"right"}>Complete</TableCell>
                   </TableRow>
               </TableHead>
               <TableBody>
                   {todos.map((row) => (  // 반복
                       <TableRow key={row.id} onClick={() => moveToRead(row.id)}>
                           <TableCell align={"center"}>{row.id}</TableCell>
                           <TableCell align={"center"}>{row.title}</TableCell>
                           <TableCell align={"center"}>{row.writer}</TableCell>
                           <TableCell align={"center"}>{row.complete ? '완료' : '진행중'}</TableCell>
                       </TableRow>
                   ))}
               </TableBody>
           </Table>
       </>
    );
}

export default TodoListComponent;