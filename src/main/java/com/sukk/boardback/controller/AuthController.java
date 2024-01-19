package com.sukk.boardback.controller;

import com.sukk.boardback.dto.request.auth.SignUpRequestDto;
import com.sukk.boardback.dto.request.auth.SignInRequestDto;
import com.sukk.boardback.dto.response.auth.SignInResponseDto;
import com.sukk.boardback.dto.response.auth.SignUpResponseDto;
import com.sukk.boardback.service.AuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

// 컨트롤러에는 비즈니스 로직이 적히면 안됨
// 레이어드 아키텍처 상에서 컨트롤러는 request을 받고 그것에 대한 response를 주는, 그것에 대한 검증 처리를 해주는 구역
// 실제 비즈니스 로직은 서비스 레이어 상에서 진행을 해야 함

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/sign-up")
    public ResponseEntity<? super SignUpResponseDto> signUp
            (@RequestBody @Valid SignUpRequestDto requestBody) {
        ResponseEntity<? super SignUpResponseDto> response = authService.signUp(requestBody);
        return response;
    }

    @PostMapping("/sign-in")
    public ResponseEntity<? super SignInResponseDto> signIn
            (@RequestBody @Valid SignInRequestDto requestBody) {
        ResponseEntity<? super SignInResponseDto> response = authService.signIn(requestBody);
        return response;
    }
}

