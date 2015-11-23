package com.pe.droid.appquejas.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the quejaestado database table.
 * 
 */
@Entity
@NamedQuery(name="Quejaestado.findAll", query="SELECT q FROM Quejaestado q")
public class Quejaestado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_queja_estado")
	private Long idQuejaEstado;

	private String nombre;

	public Quejaestado() {
	}

	public Long getIdQuejaEstado() {
		return this.idQuejaEstado;
	}

	public void setIdQuejaEstado(Long idQuejaEstado) {
		this.idQuejaEstado = idQuejaEstado;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}