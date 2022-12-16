package com.app.board.controller.board;

import com.app.board.domain.ReplyDTO;
import com.app.board.entity.Reply;
import com.app.board.service.*;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Log4j2
@RestController
@RequestMapping("/reply")
public class ReplyRestController {


    @Autowired
    private ReplyListService listService;

    @Autowired
    private ReplyInsertService insertService;

    @Autowired
    private ReplyReadService readService;

    @Autowired
    private ReplyEditService replyEditService;

    @Autowired
    private ReplyDeleteService replyDeleteService;

    // get  /reply/{bno} => list
    @GetMapping(value = "/{bno}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Reply>> selectList(
            @PathVariable("bno") int bno
    ){

        List<Reply> list = listService.selectAll(bno);

        return new ResponseEntity<>(list, HttpStatus.OK);

    }

    // post /reply => reply 객체 전송     JSON 데이터를 받아서 DB insert
    @PostMapping
    public ResponseEntity<Reply> insertReply(@RequestBody ReplyDTO replyDTO){

        log.info("insert 전 : " + replyDTO);

        // Service -> Mapper
        Reply resultReply = insertService.insertReply(replyDTO);
        // 입력된 row 의 rno 값을 구할 수 있다.

        log.info("insert 후 : " + resultReply); // rno 값이 갱신된 데이터

//        replyDTO.setReplyDate(LocalDate.now().toString());


//        return new ResponseEntity<>(readService.selectByRno(replyDTO.getRno()), HttpStatus.OK);
        return new ResponseEntity<>(resultReply, HttpStatus.OK);
    }

    // put  /reply/{rno} => reply
    @PutMapping("/{rno}")
    public ResponseEntity<Integer> editReply(
            @RequestBody ReplyDTO replyDTO,
            @PathVariable("rno") int rno
    ){
        replyDTO.setRno(rno);
        return new ResponseEntity<>(replyEditService.updateReply(replyDTO), HttpStatus.OK);
    }

    // delete /reply/{rno} => 0 / 1, success, fail
    @DeleteMapping("/{rno}")
    public ResponseEntity<Integer> delete(
            @PathVariable("rno") int rno
    ){
        return new ResponseEntity<>(replyDeleteService.deleteByRno(rno), HttpStatus.OK);
    }

}
