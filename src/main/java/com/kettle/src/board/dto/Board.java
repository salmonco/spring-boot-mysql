package com.kettle.src.board.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Board {
    private Long id;
    private String title;
    private String contents;
    private LocalDateTime date;
    private String writer;
    private Long user_id;
}
