package com.pe.droid.appquejas.service;

import java.util.List;

import com.pe.droid.appquejas.domain.Queja;

public interface QuejaService {

	List<Queja> listarQuejasPorUsuario(Integer idUsuario);
	
}
