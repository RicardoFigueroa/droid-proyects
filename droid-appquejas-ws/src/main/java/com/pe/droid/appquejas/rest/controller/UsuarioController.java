package com.pe.droid.appquejas.rest.controller;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pe.droid.appquejas.domain.Usuario;
import com.pe.droid.appquejas.service.QuejaService;

@RestController
@RequestMapping("usuario")
public class UsuarioController {

	private static final Logger logger = Logger
			.getLogger(UsuarioController.class);

	@Autowired
	private QuejaService quejaService;

	@RequestMapping(value = "", method = POST)
	public Usuario getZonas(@RequestBody Usuario usu) {
		return quejaService.findByContrasenaAndUsuario(usu.getContrasena(),
				usu.getUsuario());
	}

}
