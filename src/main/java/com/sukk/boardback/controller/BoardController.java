package com.sukk.boardback.controller;

import com.sukk.boardback.dto.request.board.PostBoardRequestDto;
import com.sukk.boardback.dto.response.board.GetBoardResponseDto;
import com.sukk.boardback.dto.response.board.PostBoardResponseDto;
import com.sukk.boardback.dto.response.user.GetSignInUserResponseDto;
import com.sukk.boardback.service.BoardService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/board")
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/{boardNumber}")
    public ResponseEntity<? super GetBoardResponseDto> getBoard(
            @PathVariable("boardNumber") Integer boardNumber
    ) {
        ResponseEntity<? super GetBoardResponseDto> response = boardService.getBoard(boardNumber);
        return response;
    }

    @PostMapping("")
    public ResponseEntity<? super PostBoardResponseDto> postBoard(
            @RequestBody @Valid PostBoardRequestDto requestBody
//            @AuthenticationPrincipal String email
    ) {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String principalEmail = (String) principal;
        ResponseEntity<? super PostBoardResponseDto> response = boardService.postBoard(requestBody, principalEmail);
        return response;
    }


}
