package com.pe.droid.appquejas.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the trabajador database table.
 * 
 */
@Entity
@NamedQuery(name="Trabajador.findAll", query="SELECT t FROM Trabajador t")
public class Trabajador implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TrabajadorPK id;

	public Trabajador() {
	}

	public TrabajadorPK getId() {
		return this.id;
	}

	public void setId(TrabajadorPK id) {
		this.id = id;
	}

}