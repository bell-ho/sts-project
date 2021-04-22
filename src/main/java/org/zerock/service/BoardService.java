package org.zerock.service;

import org.zerock.domain.BoardVO;

import java.util.List;

public interface BoardService {

    List<BoardVO> getList();

    void insert(BoardVO boardVO);

    void insertKey(BoardVO boardVO);

    BoardVO read(BoardVO boardVO);

    int delete(BoardVO boardVO);

    int update(BoardVO boardVO);
}
