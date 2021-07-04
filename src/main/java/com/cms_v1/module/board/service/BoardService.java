package com.cms_v1.module.board.service;

import com.cms_v1.module.board.model.Board;
import com.cms_v1.module.board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 게시판 service
 * @author LeeSeungyoung
 * */
@Service
public class BoardService {

    @Autowired
    private BoardRepository repository;

    /**
     * 리스트 return
     * @return
     * */
    public List<Board> getList() {
        return repository.getList();
    };


    /**
     * 게시물 상세정보 return
     * @param BoardNm
     * @return
     * */
    public Board get(int BoardNm) {
        return repository.get(BoardNm);
    };

    /**
     * 게시물 등록 / 수정
     * @param param
     * */
    public void save(Board param) {
        Board board = repository.get(param.getBoardNm());
        if (board == null) {
            repository.save(param);
        } else {
            repository.save(param);
        }
        repository.save(board);
    };

    /**
     * 게시물 삭제
     * @param BoardNm
     * */
    public void delete(int BoardNm) {
        repository.delete(BoardNm);
    };

}
