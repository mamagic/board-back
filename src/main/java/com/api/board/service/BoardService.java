package com.api.board.service;

import com.api.board.entity.Board;
import com.api.board.repository.BoardRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    @Autowired
    BoardRepository boardRepository;

    @Transactional
    public List<Board> getList(){
        return boardRepository.findAll();
    }


}
