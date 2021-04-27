package com.atividades.atividade2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("objetivos")
public class Atividade2Controller {
	
	@GetMapping
	public String objetivos (){
		return "String Boot e Back-End";
	}

}
