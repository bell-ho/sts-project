package org.zerock.mapper;

import org.apache.ibatis.annotations.Select;
import org.zerock.domain.BoardVO;

import java.util.List;

public interface BoardMapper {

    List<BoardVO> getList();

    void insert(BoardVO boardVO);

    void insertKey(BoardVO boardVO);

    BoardVO read(BoardVO boardVO);

    int delete(BoardVO boardVO);

    int update(BoardVO boardVO);
}
