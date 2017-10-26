package br.jrfy.wsminhasvacinas.repositories;

import org.springframework.stereotype.Repository;

import br.jrfy.wsminhasvacinas.models.Pet;
import br.jrfy.wsminhasvacinas.utils.repositories.GenericRepository;

@Repository
public interface PetRepository extends GenericRepository<Pet, Long> {
	
}
