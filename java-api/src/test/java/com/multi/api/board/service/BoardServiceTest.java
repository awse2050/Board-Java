package com.multi.api.board.service;

import com.multi.core.domains.board.entity.Board;
import com.multi.core.domains.board.entity.BoardRepository;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;

@ExtendWith(
        MockitoExtension.class
)
@Log4j2
class BoardServiceTest {
    @Mock
    private BoardRepository boardRepository;

    @InjectMocks
    private BoardService boardService;

    @DisplayName("게시글 등록 성공 테스트")
    @Test
    void registerBoard() {
        Board board = new Board("김김");
        // 이게 맞나..?
        // register를 하면 board로 등록하고, board로 결과물이 나온다고 예상한다 - Stubbing
        given(boardService.register(board)).willReturn(board);

        boardService.register(board);

        then(boardRepository).should().save(board);
    }

}