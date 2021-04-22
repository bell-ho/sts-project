package org.zerock.service;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.domain.BoardVO;
import org.zerock.mapper.BoardMapper;

import java.util.List;

@Log4j
@Service
@AllArgsConstructor
public class BoardServiceImpl implements BoardService {

    @Autowired
    private BoardMapper mapper;

    @Override
    public List<BoardVO> getList() {
        return mapper.getList();
    }

    @Override
    public void insert(BoardVO boardVO) {

    }

    @Override
    public void insertKey(BoardVO boardVO) {
        mapper.insertKey(boardVO);
    }

    @Override
    public BoardVO read(BoardVO boardVO) {
        return mapper.read(boardVO);
    }

    @Override
    public int delete(BoardVO boardVO) {
        return mapper.delete(boardVO);
    }

    @Override
    public int update(BoardVO boardVO) {
        return mapper.update(boardVO);
    }
}
