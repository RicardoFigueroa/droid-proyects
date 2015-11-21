package com.pe.droid.appquejas.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pe.droid.appquejas.domain.Queja;

@Repository
public interface QuejaRepository extends CrudRepository<Queja, Long> {

	List<Queja> findByIdCliente(Integer idCliente);
	
	List<Queja> findByIdTrabajador(Integer idTrabajador);
	
}
