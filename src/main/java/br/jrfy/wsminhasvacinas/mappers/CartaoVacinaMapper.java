package br.jrfy.wsminhasvacinas.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import br.jrfy.wsminhasvacinas.models.CartaoVacina;

public interface CartaoVacinaMapper {
	public List<CartaoVacina> findByNome(@Param("nome") String nome);
}
