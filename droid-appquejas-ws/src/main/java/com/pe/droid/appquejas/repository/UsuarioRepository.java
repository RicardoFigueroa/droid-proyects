package com.pe.droid.appquejas.repository;

import org.springframework.data.repository.CrudRepository;

import com.pe.droid.appquejas.domain.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long>{

	
	Usuario findByContrasenaAndUsuario(String contrasena,String usuario);
	
}
