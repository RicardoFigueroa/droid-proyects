package com.pe.droid.appquejas.rest.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pe.droid.appquejas.domain.Quejazona;
import com.pe.droid.appquejas.repository.QuejaZonaRepository;

@RestController
@RequestMapping("zona")
public class QuejaZonaController {

	private static final Logger logger = Logger
			.getLogger(QuejaGravedadController.class);

	@Autowired
	private QuejaZonaRepository quejaZonaRepository;

	@RequestMapping(value = "", method = GET)
	public List<Quejazona> getQuejasByUsuario(@PathVariable() String idUsuario) {
		return (List<Quejazona>) quejaZonaRepository.findAll();
	}

}
