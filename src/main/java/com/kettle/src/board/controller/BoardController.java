package com.kettle.src.board.controller;

import com.kettle.src.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardController {

    @Autowired
    private BoardService boardService;

    @RequestMapping(value = "/bhome")
    public String bhome(){
        System.out.println("bhome");
        return "index";
    }

    @RequestMapping("/getBoard")
    public String getBoardList(Model model) {
        System.out.println("게시판 출력");
        model.addAttribute("posts",boardService.getBoardList());
        return "board";
    }
}
