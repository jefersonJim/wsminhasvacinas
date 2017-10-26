package br.jrfy.wsminhasvacinas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.jrfy.wsminhasvacinas.models.Pet;
import br.jrfy.wsminhasvacinas.service.PetService;

@RestController
@RequestMapping(value="/pet")
public class PetController {
	@Autowired
	private PetService petService;
	
	@RequestMapping(value={"/{id}"},method= RequestMethod.GET)
	public Pet findVacinaById(@PathVariable("id") Long id){
		return this.petService.findById(id);
	}
	
	@RequestMapping(value={"","/"},method= RequestMethod.POST)
	private String cadastrar(@RequestBody Pet pet){
		this.petService.save(pet);
		return "O PET"+pet.getNome()+" foi cadastrado com succeso!";
	}
	
	@RequestMapping(value={"","/"},method= RequestMethod.PUT)
	private String atualizar(@RequestBody Pet pet){
		this.petService.save(pet);
		return "O PET "+pet.getNome()+" foi atualizada com succeso!";
	}
	
	@RequestMapping(value={"/{id}"},method= RequestMethod.DELETE)
	private String deletar(@PathVariable("id") Long id){
		this.petService.delete(id);
		return "Registro apagado com sucesso!";
	}	
}
