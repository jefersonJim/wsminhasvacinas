package br.jrfy.wsminhasvacinas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.jrfy.wsminhasvacinas.models.Vacina;
import br.jrfy.wsminhasvacinas.service.VacinaService;

@RestController
@RequestMapping(value="/vacina")
public class VacinaController {
	
	@Autowired
	private VacinaService vacinaService;
	
	@RequestMapping(value={"","/"},method= RequestMethod.GET)
	private List<Vacina> findVacinas( 	@RequestParam(value = "usuario", required = true) Integer usuario,
										@RequestParam(value = "codigo", required = false) Integer codigo,
										@RequestParam(value = "term", required = false ) String term) {
		return this.vacinaService.findAllVacinas(usuario,codigo, term);
	}
	
	
	@RequestMapping(value={"/{id}"},method= RequestMethod.GET)
	public Vacina findVacinaById(@PathVariable("id") Integer id){
		return this.vacinaService.findVacinaById(id);
	}
	
	@RequestMapping(value={"","/"},method= RequestMethod.POST)
	private String cadastrar(@RequestBody Vacina vacina){
		this.vacinaService.save(vacina);
		return "A vacina "+vacina.getNome()+" foi cadastrada com succeso!";
	}
	
	@RequestMapping(value={"","/"},method= RequestMethod.PUT)
	private String atualizar(@RequestBody Vacina vacina){
		this.vacinaService.save(vacina);
		return "A vacina "+vacina.getNome()+" foi atualizada com succeso!";
	}
	
	@RequestMapping(value={"/{id}"},method= RequestMethod.DELETE)
	private String deletar(@PathVariable("id") Integer id){
		this.vacinaService.delete(id);
		return "Registro apagado com sucesso!";
	}	
}
