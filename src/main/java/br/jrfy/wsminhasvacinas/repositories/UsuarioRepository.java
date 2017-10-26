package br.jrfy.wsminhasvacinas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.jrfy.wsminhasvacinas.models.Usuario;
import br.jrfy.wsminhasvacinas.utils.repositories.GenericRepository;

@Repository
public interface UsuarioRepository extends GenericRepository<Usuario, Long>{
	@Query("from Usuario u order by u.nome")
	List<Usuario> findAll();
	
	@Query("from Usuario u where u.email = :email and senha = :senha ")
	Usuario login(@Param("email") String email, @Param("senha") String senha);
	
	

}
