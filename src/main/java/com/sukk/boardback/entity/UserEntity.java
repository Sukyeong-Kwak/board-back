package com.sukk.boardback.entity;

import com.sukk.boardback.dto.request.auth.SignUpRequestDto;
import com.sukk.boardback.dto.response.auth.SignUpResponseDto;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="users")
@Table(name="users")
public class UserEntity {

    @Id
    private String email;
    private String password;
    private String nickname;
    private String telNumber;
    private String address;
    private String addressDetail;
    private boolean agreedPersonal;
    private String profileImage;

    public UserEntity(SignUpRequestDto dto) {
        this.email = dto.getEmail();
        this.password = dto.getPassword();
        this.nickname = dto.getNickname();
        this.telNumber = dto.getTelNumber();
        this.address = dto.getPassword();
        this.addressDetail = dto.getAddressDetail();
        this.agreedPersonal = dto.getAgreedPersonal();

    }
}
