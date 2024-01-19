package com.sukk.boardback.repository;

import com.sukk.boardback.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String> {

    boolean existsByEmail(String email);
    boolean existsByNickname(String nickname);
    boolean existsByTelNumber(String telNumber);

    UserEntity findByEmail(String email); // 여기 UserEntity 라는 값이 왜 들어가지?
}
