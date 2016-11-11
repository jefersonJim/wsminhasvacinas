package br.jrfy.wsminhasvacinas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.jrfy.wsminhasvacinas.models.EmpresaPessoa;
import br.jrfy.wsminhasvacinas.repositories.EmpresaPessoaRepository;

@Service
public class EmpresaPessoaService {
	@Autowired
	private EmpresaPessoaRepository empresaPessoaRepository;
	
	public void cadastrar(EmpresaPessoa empresaPessoa){
		this.empresaPessoaRepository.save(empresaPessoa);
	}
	
	public void atualizar(EmpresaPessoa empresaPessoa){
		this.empresaPessoaRepository.save(empresaPessoa);
	}
	
}