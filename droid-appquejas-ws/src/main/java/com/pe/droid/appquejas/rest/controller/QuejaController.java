package com.pe.droid.appquejas.rest.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pe.droid.appquejas.domain.Queja;
import com.pe.droid.appquejas.service.QuejaService;

@RestController
@RequestMapping("queja")
public class QuejaController {

	private static final Logger logger = Logger.getLogger(QuejaController.class);
	
	@Autowired
	private QuejaService quejaService;
	
	public QuejaController() {

	}


	/**
	 * 
	 * @param idUsuario
	 * @return
	 */
	@RequestMapping(value = "/{idUsuario}", method = GET)
	public List<Queja> getQuejasByUsuario(@PathVariable() String idUsuario) {
		System.out.println(idUsuario);
		logger.info(idUsuario);
		return quejaService.listarQuejasPorUsuario(new Integer(idUsuario));
	}

	
	@RequestMapping(value = "", method = PUT)
	public Map<String,Object> registrarVerificacion(@RequestBody
			Queja queja) {
	
		Map<String,Object> mapRequest = new LinkedHashMap<>();
		
		
		try {
			
			quejaService.actualizarQueja(queja);
			mapRequest.put("SaveStatus", "OK");
			
		} catch (Exception e) {
			mapRequest.put("SaveStatus", "ERROR");
			mapRequest.put("ErrorMessage", e.getMessage());
		}
		
		return mapRequest;
	}
}
