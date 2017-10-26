package br.jrfy.wsminhasvacinas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.jrfy.wsminhasvacinas.models.Usuario;
import br.jrfy.wsminhasvacinas.repositories.UsuarioRepository;
import br.jrfy.wsminhasvacinas.utils.security.ConverterToHash;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public Usuario login(Usuario usuario){
		return usuarioRepository.login(usuario.getEmail(),ConverterToHash.md5(usuario.getSenha()));
	}
	
	public List<Usuario> findAll(){
		return usuarioRepository.findAll();
	}
	
	public Usuario findById(Long id){
		return usuarioRepository.findOne(id);
	}
	
	public void save(Usuario usuario){
		usuarioRepository.save(usuario);
	}
	
	public void delete(Long id){
		usuarioRepository.delete(id);
	}
}
