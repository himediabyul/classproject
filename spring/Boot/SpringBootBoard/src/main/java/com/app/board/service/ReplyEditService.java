package com.app.board.service;

import com.app.board.domain.ReplyDTO;
import com.app.board.entity.Reply;
import com.app.board.mapper.ReplyMapper;
import com.app.board.repository.ReplyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class ReplyEditService {

    @Autowired
    private ReplyMapper replyMapper;

    @Autowired
    private ReplyRepository replyRepository;

    public int updateReply(ReplyDTO replyDTO){

        Reply reply = replyDTO.toReplyEntity();

        reply.setUpdateDate(LocalDate.now());
        reply.setReplyDate(LocalDate.parse(replyDTO.getReplyDate()));

        return replyRepository.save(reply) != null ? 1 : 0;
//        return replyMapper.updateReply(replyDTO);
    }

}