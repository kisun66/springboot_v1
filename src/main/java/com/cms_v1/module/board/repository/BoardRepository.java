package com.cms_v1.module.board.repository;

import com.cms_v1.module.board.model.Board;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 게시판 repository
 * @author LeeSeungyoung
 * */
@Repository
public interface BoardRepository {

    List<Board> getList();

    Board get(int BoardNm);

    void save(Board board);

    void update(Board board);

    void delete(int BoardNm);

}
