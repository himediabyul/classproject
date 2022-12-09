package com.app.board.controller.board;

import com.app.board.domain.ReplyDTO;
import com.app.board.service.ReplyInsertService;
import com.app.board.service.ReplyListService;
import com.app.board.service.ReplyReadService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
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

    // get  /reply{bno} => list 전달
    @GetMapping(value="/{bno}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<ReplyDTO>> selectList(@PathVariable("bno") int bno){

//        List<ReplyDTO> list = listService.selectList();

        return new ResponseEntity<>(listService.selectList(bno), HttpStatus.OK);
    }

    // post /reply => reply 객체 전송     JSON 데이터를 받아서 DB insert
    @PostMapping
    public ResponseEntity<ReplyDTO> insertReply(@RequestBody ReplyDTO replyDTO){

        log.info("insert 전 : " + replyDTO);

        // Service -> Mapper
        insertService.insertReply(replyDTO);

        log.info("insert 후 : " + replyDTO); // rno 값이 갱신된 데이터

//        replyDTO.setReplyDate(LocalDate.now().toString());


        return new ResponseEntity<>(readService.selectByRno(replyDTO.getRno()), HttpStatus.OK);
    }

    // put  /reply/{rno} => reply 변경 객체
    // delete /reply/{rno} => 0 or 1, ok or fail


}
