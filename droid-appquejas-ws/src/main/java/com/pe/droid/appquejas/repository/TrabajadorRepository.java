package com.pe.droid.appquejas.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.pe.droid.appquejas.domain.Trabajador;
import com.pe.droid.appquejas.domain.TrabajadorPK;

public interface TrabajadorRepository extends CrudRepository<Trabajador, TrabajadorPK> {

	  @Query(value = "SELECT * FROM trabajador WHERE id_trabajador = ?0", nativeQuery = true)
	  Trabajador findByIdTrabajador(Long id_trabajador);
	
}
