package com.multi.api.board.service;

import com.multi.core.domains.board.entity.Board;
import com.multi.core.domains.board.entity.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;

    // 컴파일 오류를 해결하고 간단하게 통합테스트를 진행.
    public Long register(String title) {
        Board entity = new Board(title);
        boardRepository.save(entity);

        return null;
    }

}
