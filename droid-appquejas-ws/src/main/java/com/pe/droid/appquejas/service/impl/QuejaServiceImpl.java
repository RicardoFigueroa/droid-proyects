package com.pe.droid.appquejas.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pe.droid.appquejas.domain.Queja;
import com.pe.droid.appquejas.repository.QuejaRepository;
import com.pe.droid.appquejas.service.QuejaService;

@Service
public class QuejaServiceImpl implements QuejaService {

	@Autowired
	private QuejaRepository quejaRepository;
	
	@Override
	public List<Queja> listarQuejasPorUsuario(Integer idUsuario) {

		List<Queja> quejaList = new ArrayList<>();
		quejaList.addAll(quejaRepository.findByIdCliente(idUsuario));
		quejaList.addAll(quejaRepository.findByIdTrabajador(idUsuario));

		return quejaList;
	}

}
