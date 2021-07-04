package com.cms_v1.module.board.controller;

import com.cms_v1.module.board.model.Board;
import com.cms_v1.module.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 게시판 controller
 * @author LeeSeungyoung
 * */
@RequestMapping("/board")
@RestController
public class BoardController {

    @Autowired
    private BoardService boardService;

    /**
     * 리스트 return
     * @return
     * */
    @GetMapping
    public List<Board> getList() {
        return boardService.getList();
    };


    /**
     * 게시물 상세정보 return
     * @param BoardNm
     * @return
     * */
    @GetMapping("/{BoardNm}")
    public Board get(@PathVariable int BoardNm) {
        return boardService.get(BoardNm);
    };

    /**
     * 게시물 등록 / 수정
     * @param board
     * */
    @GetMapping("/save")
    public String save(Board board) {
        boardService.save(board);
        return "save complete";
    };


    /**
     * 게시물 삭제
     * @param BoardNm
     * */
    @GetMapping("/delete/{BoardNm}")
    public String delete(@PathVariable int BoardNm) {
        boardService.delete(BoardNm);
        return "delete complete";
    };

}
