package br.jrfy.wsminhasvacinas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.jrfy.wsminhasvacinas.models.TpMedida;
import br.jrfy.wsminhasvacinas.repositories.TpMedidaRepository;

@Service
public class TpMedidaService {
	
	@Autowired
	TpMedidaRepository tpMedidaRepository;
	
	public List<TpMedida> findAll(){
		return tpMedidaRepository.findAll();
	}
}
