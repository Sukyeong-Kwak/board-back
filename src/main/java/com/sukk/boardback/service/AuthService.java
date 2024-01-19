package com.sukk.boardback.service;

import com.sukk.boardback.dto.request.auth.SignInRequestDto;
import com.sukk.boardback.dto.request.auth.SignUpRequestDto;
import com.sukk.boardback.dto.request.auth.SignInRequestDto;
import com.sukk.boardback.dto.response.auth.SignInResponseDto;
import com.sukk.boardback.dto.response.auth.SignUpResponseDto;
import org.springframework.http.ResponseEntity;

public interface AuthService {

    ResponseEntity<? super SignUpResponseDto> signUp(SignUpRequestDto dto);

    ResponseEntity<? super SignInResponseDto> signIn(SignInRequestDto dto);
}
