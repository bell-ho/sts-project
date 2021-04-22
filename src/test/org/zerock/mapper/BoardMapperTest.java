package org.zerock.mapper;

import lombok.extern.log4j.Log4j;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTest {

    @Autowired
    private BoardMapper mapper;

    @Ignore
    @Test
    public void getList() {
        mapper.getList().forEach(board->log.info(board));
    }

    @Ignore
    @Test
    public void insert(){
        BoardVO boardVO = new BoardVO();
        boardVO.setBoardTitle("gd");
        boardVO.setBoardWriter("aa");
        boardVO.setBoardContent("aaa");

        mapper.insertKey(boardVO);
        log.info(boardVO);
    }

    @Ignore
    @Test
    public void read(){
        BoardVO boardVO = new BoardVO();
        boardVO.setBoardNumber(1);
        BoardVO boardVO1 = mapper.read(boardVO);
        log.info(boardVO1);
    }
}