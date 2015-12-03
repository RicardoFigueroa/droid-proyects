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
	private Long idRol;

	@Column(name="id_trabajador", insertable=false, updatable=false)
	private Long idTrabajador;

	public TrabajadorPK() {
	}
	public Long getIdRol() {
		return this.idRol;
	}
	public void setIdRol(Long idRol) {
		this.idRol = idRol;
	}
	public Long getIdTrabajador() {
		return this.idTrabajador;
	}
	public void setIdTrabajador(Long idTrabajador) {
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

}