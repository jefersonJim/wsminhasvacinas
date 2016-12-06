package br.jrfy.wsminhasvacinas.controllers;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.jrfy.wsminhasvacinas.models.CartaoVacina;
import br.jrfy.wsminhasvacinas.service.CartaoVacinaService;

@RestController
@RequestMapping(value="/cartao-vacina")
public class CartaoVacinaController {
	
	@Autowired
	private CartaoVacinaService cartaoVacinaService;
	
	@RequestMapping(value={"","/"}, method=RequestMethod.GET)
	public List<CartaoVacina> findAll(@RequestParam(value="nome", required=false) String nome){
		return this.cartaoVacinaService.findByNome(nome);
	}	
	
	@RequestMapping(value={"","/"}, method=RequestMethod.POST)
	public String cadastrar(@RequestBody CartaoVacina cartaoVacina){
		this.cartaoVacinaService.save(cartaoVacina);
		return "Salvo com sucesso!";
	}
	
	@RequestMapping(value={"","/"}, method=RequestMethod.PUT)
	public String update(@RequestBody CartaoVacina cartaoVacina){
		this.cartaoVacinaService.update(cartaoVacina);
		return "Atualizado com sucesso!!";
	}
	
	@RequestMapping(value={"","/"}, method=RequestMethod.DELETE)
	public String delete(@PathVariable BigDecimal id){
		this.cartaoVacinaService.delete(id);
		return "Deletado com sucesso!!";
	}
	
	
}
