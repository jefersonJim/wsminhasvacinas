package br.jrfy.wsminhasvacinas.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import br.jrfy.wsminhasvacinas.models.Vacina;

public interface VacinaMapper {
	public List<Vacina> findAllVacinaByFilter(@Param("idUsuario")Integer idUsuario,@Param("id")Integer id, @Param("term")String term);
}
