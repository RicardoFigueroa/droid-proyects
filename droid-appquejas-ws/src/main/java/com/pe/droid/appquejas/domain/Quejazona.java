package com.pe.droid.appquejas.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the quejazona database table.
 * 
 */
@Entity
@NamedQuery(name="Quejazona.findAll", query="SELECT q FROM Quejazona q")
public class Quejazona implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_zona")
	private Long idZona;

	private String nombre;

	public Quejazona() {
	}

	public Long getIdZona() {
		return this.idZona;
	}

	public void setIdZona(Long idZona) {
		this.idZona = idZona;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}