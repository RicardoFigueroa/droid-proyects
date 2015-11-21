package com.pe.droid.appquejas.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the residencia database table.
 * 
 */
@Entity
@NamedQuery(name="Residencia.findAll", query="SELECT r FROM Residencia r")
public class Residencia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_residencia")
	private int idResidencia;

	private String direccion;

	private String distrito;

	private String nombre;

	//bi-directional many-to-one association to Cliente
	@OneToMany(mappedBy="residencia")
	private List<Cliente> clientes;

	public Residencia() {
	}

	public int getIdResidencia() {
		return this.idResidencia;
	}

	public void setIdResidencia(int idResidencia) {
		this.idResidencia = idResidencia;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getDistrito() {
		return this.distrito;
	}

	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Cliente> getClientes() {
		return this.clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public Cliente addCliente(Cliente cliente) {
		getClientes().add(cliente);
		cliente.setResidencia(this);

		return cliente;
	}

	public Cliente removeCliente(Cliente cliente) {
		getClientes().remove(cliente);
		cliente.setResidencia(null);

		return cliente;
	}

}