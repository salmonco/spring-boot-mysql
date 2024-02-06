package com.kettle.src.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardController {
    @RequestMapping(value = "/bhome")
    public String bhome(){
        System.out.println("bhome");
        return "index.html";
    }

}
