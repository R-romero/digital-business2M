package br.com.fiap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.fiap.model.Pessoa;

@Controller
@RequestMapping("/pessoa")
public class PessoaController {

	@GetMapping(value="cadastrar")
	public String cadastro(){
		return "pessoa/cadastro";
	}

	@PostMapping(value="cadastrar")
	public String exibir(Pessoa pessoa){
		System.out.println("Nome:" + pessoa.getNome());
		return "pessoa/sucesso";
		
	}
}
