package com.pe.droid.appquejas.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pe.droid.appquejas.domain.Quejagravedad;

@Repository
public interface QuejaGravedadRepository extends
		CrudRepository<Quejagravedad, Long> {

}
