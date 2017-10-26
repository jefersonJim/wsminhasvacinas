package br.jrfy.wsminhasvacinas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.jrfy.wsminhasvacinas.models.Vacina;
import br.jrfy.wsminhasvacinas.utils.repositories.GenericRepository;

@Repository
public interface VacinaRepository extends GenericRepository<Vacina, Integer>{
	@Query("from Vacina v order by v.nome")
	List<Vacina> findAllVacinas();
}
