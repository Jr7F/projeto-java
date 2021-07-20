package com.jbank.projeto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jbank.projeto.model.Conta;
import com.jbank.projeto.repo.ContaRepo;


//para fzr a associacao usa-se uma anotação em java
//ela responde por algumas solicitações

@RestController 

//o controller é a classe que vai fazer a associação 
//entre as urls e os métodos.
public class ContaController {
	
	@Autowired
	private ContaRepo repo; //importação ContaRepo e variável repo
	
	@GetMapping("/contas")
	public java.util.List<Conta> recuperarTudo(){
		return(java.util.List<Conta>) repo.findAll();
		
	}
	
	@GetMapping("/teste") //mapeia uma execução de método à uma url (retorna uma msg)
	public String exibir() {
		return "meu springboot funciona";
	}

}
