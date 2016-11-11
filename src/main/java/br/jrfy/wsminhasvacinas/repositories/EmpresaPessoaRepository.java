package br.jrfy.wsminhasvacinas.repositories;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import br.jrfy.wsminhasvacinas.models.EmpresaPessoa;
import br.jrfy.wsminhasvacinas.utils.repositories.GenericRepository;

@Repository
public interface EmpresaPessoaRepository extends GenericRepository<EmpresaPessoa, BigDecimal>{
	
}
