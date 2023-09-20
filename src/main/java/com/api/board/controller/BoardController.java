package com.api.board.controller;

import com.api.board.controller.response.BoardResponse;
import com.api.board.entity.Board;
import com.api.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {

    @Autowired
    BoardService boardService;
    @GetMapping("/list")
    public ResponseEntity<BoardResponse> list(
            @RequestParam(name="page") int page,
            @RequestParam(name="rows") int rows,
            @RequestParam(name="sort") String sort){

        System.out.println("page: " + page);
        System.out.println("rows: " + rows);
        System.out.println("sort: " + sort);

        List<Board> board = boardService.getList();

        return ResponseEntity.ok(new BoardResponse(board, board.size()));
    }

}
