package com.pe.droid.appquejas.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the trabajadorrol database table.
 * 
 */
@Entity
@NamedQuery(name="Trabajadorrol.findAll", query="SELECT t FROM Trabajadorrol t")
public class Trabajadorrol implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_trabajador_rol")
	private int idTrabajadorRol;

	private String nombre;

	//bi-directional many-to-many association to Usuario
	@ManyToMany
	@JoinTable(
		name="trabajador"
		, joinColumns={
			@JoinColumn(name="id_rol")
			}
		, inverseJoinColumns={
			@JoinColumn(name="id_trabajador")
			}
		)
	private List<Usuario> usuarios;

	public Trabajadorrol() {
	}

	public int getIdTrabajadorRol() {
		return this.idTrabajadorRol;
	}

	public void setIdTrabajadorRol(int idTrabajadorRol) {
		this.idTrabajadorRol = idTrabajadorRol;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Usuario> getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

}