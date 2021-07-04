package com.cms_v1.module.board.controller;

import com.cms_v1.module.board.model.Board;
import com.cms_v1.module.board.service.BoardService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
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
@Api(tags = "게시판 리스트 API")
public class BoardController {

    @Autowired
    private BoardService boardService;

    /**
     * 리스트 return
     * @return
     * */
    @GetMapping
    @ApiOperation(value = "리스트 조회", notes = "게시물 리스트를 조회")
    public List<Board> getList() {
        return boardService.getList();
    };


    /**
     * 게시물 상세정보 return
     * @param BoardNm
     * @return
     * */
    @GetMapping("/{BoardNm}")
    @ApiOperation(value = "상세 조회", notes = "게시물 번호에 해당하는 상세정보를 조회")
    @ApiImplicitParam(name = "boardNm", value = "게시물 번호", example = "1")
    public Board get(@PathVariable int BoardNm) {
        return boardService.get(BoardNm);
    };

    /**
     * 게시물 등록 / 수정
     * @param board
     * */
    @GetMapping("/save")
    @ApiOperation(value = "생성, 수정", notes = "게시물 번호에 해당하는 데이터를 수정 또는 생성")
    public String save(Board board) {
        boardService.save(board);
        return "save complete";
    };


    /**
     * 게시물 삭제
     * @param BoardNm
     * */
    @GetMapping("/delete/{BoardNm}")
    @ApiOperation(value = "삭제", notes = "게시물 번호에 해당하는 데이터를 삭제")
    public String delete(@PathVariable int BoardNm) {
        boardService.delete(BoardNm);
        return "delete complete";
    };

}
