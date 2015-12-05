package com.pe.droid.appquejas.service;

import java.util.List;

import com.pe.droid.appquejas.domain.Queja;
import com.pe.droid.appquejas.domain.Usuario;

public interface QuejaService {

	List<Queja> listarQuejasPorUsuario(Integer idUsuario);

	void actualizarQueja(Queja queja) throws Exception;
	
	void registrarQueja(Queja queja) throws Exception;
	
	Usuario findByContrasenaAndUsuario(String contrasena,String usuario);
}
