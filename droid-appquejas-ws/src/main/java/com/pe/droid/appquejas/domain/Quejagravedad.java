package com.pe.droid.appquejas.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the quejagravedad database table.
 * 
 */
@Entity
@NamedQuery(name="Quejagravedad.findAll", query="SELECT q FROM Quejagravedad q")
public class Quejagravedad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_queja_gravedad")
	private Long idQuejaGravedad;

	private String nombre;

	public Quejagravedad() {
	}

	public Long getIdQuejaGravedad() {
		return this.idQuejaGravedad;
	}

	public void setIdQuejaGravedad(Long idQuejaGravedad) {
		this.idQuejaGravedad = idQuejaGravedad;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}