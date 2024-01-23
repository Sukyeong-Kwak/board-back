package com.sukk.boardback.service;

import com.sukk.boardback.dto.request.board.PostBoardRequestDto;
import com.sukk.boardback.dto.response.board.PostBoardResponseDto;
import org.springframework.http.ResponseEntity;

public interface BoardService {
    ResponseEntity<? super PostBoardResponseDto> postBoard(PostBoardRequestDto dto, String email);
}
