package com.kettle.src.board.service;

import java.util.HashMap;
import java.util.List;

import com.kettle.src.board.dto.Board;
import com.kettle.src.board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {
    @Autowired
    private BoardRepository boardRepository;

    public BoardService(){
    }

    public BoardService(BoardRepository boardMapper) {
        this.boardRepository = boardMapper;
    }

    public void createBoard(HashMap<String, Object> hashMap) {
        boardRepository.createBoard(hashMap);
    }

    public Board getBoard(Long id) {
        return boardRepository.getBoard(id);
    }
    public List<Board> getBoardList() {
        return boardRepository.getBoardList();
    }

    public void updateBoard(HashMap<String, Object> hashMap) {
        boardRepository.updateBoard(hashMap);
    }

    public void deleteBoard(Long id) {
        boardRepository.deleteBoard(id);
    }
}
