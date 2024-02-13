package com.kettle.src.board.repository;

import com.kettle.src.board.dto.Board;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Mapper
@Repository
public interface BoardRepository {
    void createBoard(HashMap<String, Object> hashMap);
    Board getBoard(Long id);
    void updateBoard(HashMap<String, Object> hashMap);
    void deleteBoard(Long id);
    List<Board> getBoardList();
}
