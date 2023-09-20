package com.api.board.controller.response;

import com.api.board.entity.Board;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class BoardResponse {
   private List<Board> data;
   private int total;
}
