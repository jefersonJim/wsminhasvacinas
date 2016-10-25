package br.jrfy.wsminhasvacinas.repositories;

import org.springframework.stereotype.Repository;

import br.jrfy.wsminhasvacinas.models.Cliente;
import br.jrfy.wsminhasvacinas.utils.repositories.GenericRepository;

@Repository
public interface ClienteRepository extends GenericRepository<Cliente, Integer>{

}
