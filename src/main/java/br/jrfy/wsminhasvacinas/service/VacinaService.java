package br.jrfy.wsminhasvacinas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.jrfy.wsminhasvacinas.mappers.VacinaMapper;
import br.jrfy.wsminhasvacinas.models.Vacina;
import br.jrfy.wsminhasvacinas.repositories.VacinaRepository;

@Service
public class VacinaService {
	@Autowired
	private VacinaRepository vacinaRepository;
	
	@Autowired
	private VacinaMapper vacinaMapper;
	
	public List<Vacina> findAllVacinas(Integer id, String nome){
		return this.vacinaMapper.findAllVacinaByFilter(id, nome);
	}
	
	public Vacina findVacinaById(Integer id){
		return this.vacinaRepository.findOne(id);
	}
	
	public Vacina save(Vacina vacina){
		return this.vacinaRepository.save(vacina);
	}
	
	public void delete(Integer id){
		this.vacinaRepository.delete(id);
	}
}
