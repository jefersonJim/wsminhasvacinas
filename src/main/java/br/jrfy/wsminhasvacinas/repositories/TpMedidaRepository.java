package br.jrfy.wsminhasvacinas.repositories;

import org.springframework.stereotype.Repository;

import br.jrfy.wsminhasvacinas.models.TpMedida;
import br.jrfy.wsminhasvacinas.utils.repositories.GenericRepository;

@Repository
public interface TpMedidaRepository extends GenericRepository<TpMedida, Integer>{

}
