package com.pe.droid.appquejas.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pe.droid.appquejas.domain.Quejazona;

@Repository
public interface QuejaZonaRepository extends CrudRepository<Quejazona, Long> {

}
