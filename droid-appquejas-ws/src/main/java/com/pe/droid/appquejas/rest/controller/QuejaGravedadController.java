package com.pe.droid.appquejas.rest.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pe.droid.appquejas.domain.Quejagravedad;
import com.pe.droid.appquejas.repository.QuejaGravedadRepository;


@RestController
@RequestMapping("gravedad")
public class QuejaGravedadController {

	private static final Logger logger = Logger.getLogger(QuejaGravedadController.class);
	
	@Autowired
	private QuejaGravedadRepository quejaGravedadRepository;
	
	@RequestMapping(value = "", method = GET)
	public List<Quejagravedad> getGavedad() {
		return (List<Quejagravedad>) quejaGravedadRepository.findAll();
	}

}
