package br.jrfy.wsminhasvacinas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.jrfy.wsminhasvacinas.models.Pessoa;
import br.jrfy.wsminhasvacinas.repositories.PessoaRepository;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepository pessoaRepository;

	public void cadastrar(Pessoa pessoa) {
		pessoaRepository.save(pessoa);		
	}

	public void atualizar(Pessoa pessoa) {
		pessoaRepository.save(pessoa);
	}
}
