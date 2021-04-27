package com.atividades.atividade1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mentalidades")
public class Atividade1Controller {
	
	@GetMapping
	public String mentalidades () {
		return "Persistência e Atenção aos Detalhes";
	}

}
