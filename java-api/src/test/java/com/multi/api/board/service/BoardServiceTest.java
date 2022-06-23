package com.multi.api.board.service;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Log4j2
class BoardServiceTest {
    @Autowired
    private BoardService boardService;

    @Autowired
    private BoardService boardService2;

    @Test
    public void checkBoardServiceBean() {
       log.info("boardService : {}", boardService);
       log.info("boardService2 : {}", boardService2);
    }

}