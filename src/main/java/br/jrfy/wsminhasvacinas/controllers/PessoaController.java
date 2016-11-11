package br.jrfy.wsminhasvacinas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.jrfy.wsminhasvacinas.models.Pessoa;
import br.jrfy.wsminhasvacinas.service.PessoaService;

@RestController
@RequestMapping(value="/pessoa")
public class PessoaController {
	
	@Autowired
	private PessoaService pessoaService;
	
	@RequestMapping(value={"","/"}, method=RequestMethod.POST)
	public String cadastrar(@RequestBody Pessoa pessoa){
		this.pessoaService.cadastrar(pessoa);
		return "Cadastro realizado com succeso!";
	}
	
	@RequestMapping(value={"","/"}, method=RequestMethod.PUT)
	public String atualizar(@RequestBody Pessoa pessoa){
		this.pessoaService.atualizar(pessoa);
		return "Registro atualizado com succeso!";
	}
}
