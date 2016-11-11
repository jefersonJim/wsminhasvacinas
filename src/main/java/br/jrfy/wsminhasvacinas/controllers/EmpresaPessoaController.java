package br.jrfy.wsminhasvacinas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.jrfy.wsminhasvacinas.models.EmpresaPessoa;
import br.jrfy.wsminhasvacinas.service.EmpresaPessoaService;

@RestController
@RequestMapping(value="/empresapessoa")
public class EmpresaPessoaController {
	
	@Autowired
	private EmpresaPessoaService empresaPessoaService;
	
	@RequestMapping(value={"","/"}, method=RequestMethod.POST)
	public String cadastrar(@RequestBody EmpresaPessoa empresaPessoa){
		this.empresaPessoaService.cadastrar(empresaPessoa);
		return "Cadastro realizado com succeso!";
	}
	
	@RequestMapping(value={"","/"}, method=RequestMethod.PUT)
	public String atualizar(@RequestBody EmpresaPessoa empresaPessoa){
		this.empresaPessoaService.atualizar(empresaPessoa);
		return "Registro atualizado com succeso!";
	}
}
