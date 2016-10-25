package br.jrfy.wsminhasvacinas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.jrfy.wsminhasvacinas.models.Cliente;
import br.jrfy.wsminhasvacinas.repositories.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public List<Cliente> findAllClientes(){
		return clienteRepository.findAll();
	}
	
	
	public void delete(Integer id){
		clienteRepository.delete(id);
	}
	
	public Cliente save(Cliente cliente){
		return this.clienteRepository.save(cliente);
	}

	public Cliente findVacinaById(Integer id) {
		return clienteRepository.findOne(id);
	}
}
