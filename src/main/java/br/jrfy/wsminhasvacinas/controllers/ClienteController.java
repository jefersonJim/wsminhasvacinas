package br.jrfy.wsminhasvacinas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.jrfy.wsminhasvacinas.models.Cliente;
import br.jrfy.wsminhasvacinas.service.ClienteService;

@RestController
@RequestMapping(value="/cliente")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	@RequestMapping(value={"","/"},method= RequestMethod.GET)
	public List<Cliente> findAllClientes(){
		return clienteService.findAllClientes();
	}
	
	@RequestMapping(value={"/{id}"},method= RequestMethod.GET)
	public Cliente findVacinaById(@PathVariable("id") Integer id){
		return this.clienteService.findVacinaById(id);
	}
	
	@RequestMapping(value={"","/"},method= RequestMethod.POST)
	private String cadastrar(@RequestBody Cliente cliente){
		this.clienteService.save(cliente);
		return "O cliente "+cliente.getNome()+" foi cadastrada com succeso!";
	}
	
	@RequestMapping(value={"","/"},method= RequestMethod.PUT)
	private String atualizar(@RequestBody Cliente cliente){
		this.clienteService.save(cliente);
		return "O cliente "+cliente.getNome()+" foi atualizada com succeso!";
	}
	
	@RequestMapping(value={"/{id}"},method= RequestMethod.DELETE)
	private String deletar(@PathVariable("id") Integer id){
		this.clienteService.delete(id);
		return "Registro apagado com sucesso!";
	}	

}
