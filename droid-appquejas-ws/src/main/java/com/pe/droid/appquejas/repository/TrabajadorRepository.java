package com.pe.droid.appquejas.repository;

import org.springframework.data.repository.CrudRepository;

import com.pe.droid.appquejas.domain.Trabajador;
import com.pe.droid.appquejas.domain.TrabajadorPK;

public interface TrabajadorRepository extends CrudRepository<Trabajador, TrabajadorPK> {
	
}
