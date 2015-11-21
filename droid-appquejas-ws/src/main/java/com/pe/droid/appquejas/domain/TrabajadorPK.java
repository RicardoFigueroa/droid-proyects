package com.pe.droid.appquejas.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the trabajador database table.
 * 
 */
@Embeddable
public class TrabajadorPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_rol", insertable=false, updatable=false)
	private int idRol;

	@Column(name="id_trabajador", insertable=false, updatable=false)
	private int idTrabajador;

	public TrabajadorPK() {
	}
	public int getIdRol() {
		return this.idRol;
	}
	public void setIdRol(int idRol) {
		this.idRol = idRol;
	}
	public int getIdTrabajador() {
		return this.idTrabajador;
	}
	public void setIdTrabajador(int idTrabajador) {
		this.idTrabajador = idTrabajador;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TrabajadorPK)) {
			return false;
		}
		TrabajadorPK castOther = (TrabajadorPK)other;
		return 
			(this.idRol == castOther.idRol)
			&& (this.idTrabajador == castOther.idTrabajador);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idRol;
		hash = hash * prime + this.idTrabajador;
		
		return hash;
	}
}