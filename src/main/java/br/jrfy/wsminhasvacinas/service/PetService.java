package br.jrfy.wsminhasvacinas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.jrfy.wsminhasvacinas.models.Pet;
import br.jrfy.wsminhasvacinas.repositories.PetRepository;

@Service
public class PetService {
	@Autowired
	private PetRepository petRepository;
	
	public List<Pet> findAll(){
		return petRepository.findAll();
	}
	
	public Pet findById(Long id){
		return petRepository.findOne(id);
	}
	
	public void save(Pet pet){
		petRepository.save(pet);
	}
	
	public void delete(Long id){
		petRepository.delete(id);
	}
}
