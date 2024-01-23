package com.sukk.boardback.controller;

import com.sukk.boardback.dto.response.user.GetSignInUserResponseDto;
import com.sukk.boardback.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("")
    public ResponseEntity<? super GetSignInUserResponseDto> getSignInUser(
            // 35강 13:30
            @AuthenticationPrincipal Object principal1
    ) {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        ResponseEntity<? super GetSignInUserResponseDto> response
                = userService.getSignInUser((String)principal);
        return response;
    }
}
