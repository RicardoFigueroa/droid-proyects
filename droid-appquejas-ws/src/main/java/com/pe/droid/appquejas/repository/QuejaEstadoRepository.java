package com.pe.droid.appquejas.repository;

import org.springframework.data.repository.CrudRepository;

import com.pe.droid.appquejas.domain.Quejaestado;
import com.pe.droid.appquejas.domain.Usuario;

public interface QuejaEstadoRepository extends CrudRepository<Quejaestado, Long>{

}
