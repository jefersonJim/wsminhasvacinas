package br.jrfy.wsminhasvacinas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.jrfy.wsminhasvacinas.models.TpMedida;
import br.jrfy.wsminhasvacinas.service.TpMedidaService;

@RestController
@RequestMapping(value="/tpmedida")
public class TpMedidaController {
	
	@Autowired
	private TpMedidaService tpMedidaService;
	
	@RequestMapping(value={"","/"})
	public List<TpMedida> findAll(){
		return this.tpMedidaService.findAll();
	}
}
