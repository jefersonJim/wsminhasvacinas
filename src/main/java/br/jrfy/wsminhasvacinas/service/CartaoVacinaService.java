package br.jrfy.wsminhasvacinas.service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.jrfy.wsminhasvacinas.mappers.CartaoVacinaMapper;
import br.jrfy.wsminhasvacinas.models.CartaoVacina;
import br.jrfy.wsminhasvacinas.repositories.CartaoVacinaRepository;

@Service
public class CartaoVacinaService {
	@Autowired
	private CartaoVacinaRepository cartaoVacinaRepository;
	
	@Autowired
	private CartaoVacinaMapper cartaoVacinaMapper;
	
	public void save(CartaoVacina cartaoVacina){
		cartaoVacina.setCriacao(new Date());
		this.cartaoVacinaRepository.save(cartaoVacina);
	}
	
	public void delete(BigDecimal id){
		this.cartaoVacinaRepository.delete(id);
	}
	
	public void update(CartaoVacina cartaoVacina){
		this.cartaoVacinaRepository.save(cartaoVacina);
	}
	
	public List<CartaoVacina> findByNome(String nome){
		return this.cartaoVacinaMapper.findByNome(nome);
	}
}
