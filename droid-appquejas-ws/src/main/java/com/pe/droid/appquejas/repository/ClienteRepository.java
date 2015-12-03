package com.pe.droid.appquejas.repository;

import org.springframework.data.repository.CrudRepository;

import com.pe.droid.appquejas.domain.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}
