package com.pe.droid.appquejas.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pe.droid.appquejas.domain.Queja;
import com.pe.droid.appquejas.domain.Quejaestado;
import com.pe.droid.appquejas.domain.Usuario;
import com.pe.droid.appquejas.repository.QuejaEstadoRepository;
import com.pe.droid.appquejas.repository.QuejaRepository;
import com.pe.droid.appquejas.repository.UsuarioRepository;
import com.pe.droid.appquejas.service.QuejaService;

@Service
public class QuejaServiceImpl implements QuejaService {

	@Autowired
	private QuejaRepository quejaRepository;

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Autowired
	private QuejaEstadoRepository quejaEstadoRepository;

	@Override
	public List<Queja> listarQuejasPorUsuario(Integer idUsuario) {

		List<Queja> quejaList = new ArrayList<>();
		quejaList.addAll(quejaRepository.findByIdCliente(idUsuario));
		quejaList.addAll(quejaRepository.findByIdTrabajador(idUsuario));


		quejaList.forEach(q -> {

			Usuario u = usuarioRepository.findOne(q.getIdCliente().longValue());
			Quejaestado qe = quejaEstadoRepository.findOne(q.getIdQuejaEstado()
					.longValue());
			q.setNombreEstado(qe.getNombre());
			q.setNombreCliente(u.getApellidoPaterno() + " "
					+ u.getApellidoMaterno() + ", " + u.getNombre());
			
			if(q.getIdTrabajador()!=null){
				Usuario ut = usuarioRepository.findOne(q.getIdTrabajador().longValue());
				q.setNombreTrabajador(ut.getApellidoPaterno() + " "
						+ ut.getApellidoMaterno() + ", " + ut.getNombre());
			}
			
		});

		return quejaList;
	}

}
