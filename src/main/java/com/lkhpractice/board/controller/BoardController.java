package com.lkhpractice.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardController {

	@RequestMapping(value = "/write_form")
	public String write() {
		
		return "writeForm";
	}
}
