package br.jrfy.wsminhasvacinas.controllers;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.jrfy.wsminhasvacinas.models.Usuario;
import br.jrfy.wsminhasvacinas.service.UsuarioService;
import br.jrfy.wsminhasvacinas.utils.security.ConverterToHash;

@RestController
@RequestMapping(value="/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@RequestMapping(value={"/login","/login/"},method= RequestMethod.POST)
	public ResponseEntity<Usuario> login(@RequestBody Usuario usuario){
		Usuario user = this.usuarioService.login(usuario);
		if(user != null){
			user.setSenha(null);			
		}
		else{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
		return ResponseEntity.status(HttpStatus.OK).body(user);
	}
	
	@RequestMapping(value={"/{id}"},method= RequestMethod.GET)
	public Usuario findVacinaById(@PathVariable("id") Long id){
		return this.usuarioService.findById(id);
	}
	
	@RequestMapping(value={"","/"},method= RequestMethod.POST)
	private String cadastrar(@RequestBody Usuario usuario){
		usuario.setDataCriacao(new Date());
		usuario.setSenha(ConverterToHash.md5(usuario.getSenha()));
		this.usuarioService.save(usuario);
		return "A vacina "+usuario.getNome()+" foi cadastrada com succeso!";
	}
	
	@RequestMapping(value={"","/"},method= RequestMethod.PUT)
	private String atualizar(@RequestBody Usuario usuario){
		this.usuarioService.save(usuario);
		return "O usuário "+usuario.getNome()+" foi atualizada com succeso!";
	}
	
	@RequestMapping(value={"/{id}"},method= RequestMethod.DELETE)
	private String deletar(@PathVariable("id") Long id){
		this.usuarioService.delete(id);
		return "Registro apagado com sucesso!";
	}	
}
