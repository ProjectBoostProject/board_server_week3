package com.example.pbp.service;

import com.example.pbp.dto.request.BoardRequest;
import com.example.pbp.dto.response.BoardResponse;
import com.example.pbp.dto.response.BoardsResponse;
import org.springframework.transaction.annotation.Transactional;

public interface BoardService {
    int BOARDS_LIMIT = 10;

    BoardsResponse getBoardsResponse(int menuId, int startPageNum);
    BoardResponse getBoardResponseById(int boardId);
    @Transactional
    void addBoard(BoardRequest boardRequest);
    @Transactional
    void updateBoardById(int boardId, BoardRequest boardRequest);
    @Transactional
    void deleteBoardById(int boardId);
}
