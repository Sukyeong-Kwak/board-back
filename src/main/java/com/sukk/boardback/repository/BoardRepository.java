package com.sukk.boardback.repository;

import com.sukk.boardback.entity.BoardEntity;
import com.sukk.boardback.repository.resultSet.GetBoardResultSet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<BoardEntity, Integer> {

    BoardEntity findByBoardNumber(Integer boardNumber);

    @Query(
            value =
            "SELECT " +
            "B.board_number AS boardNumber ," +
            "B.title AS title, " +
            "B.content AS content, " +
            "B.write_datetime AS writerDatetime, " +
            "U.nickname AS writerNickname, " +
            "U.profile_image AS writerProfileImage " +
            "FROM board AS B " +
            "INNER JOIN users AS U " +
            "ON B.writer_email = U.email " +
            "WHERE board_number = ?1 ",
            nativeQuery = true
    )
    GetBoardResultSet getBoard(Integer boardNubmer);

}
