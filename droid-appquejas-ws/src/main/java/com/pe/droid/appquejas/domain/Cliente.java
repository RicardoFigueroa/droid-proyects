package com.pe.droid.appquejas.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cliente database table.
 * 
 */
@Entity
@NamedQuery(name="Cliente.findAll", query="SELECT c FROM Cliente c")
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_cliente")
	private Long idCliente;

	@Column(name="numero_departamento")
	private String numeroDepartamento;

	//bi-directional many-to-one association to Residencia
	@ManyToOne
	@JoinColumn(name="id_residencia")
	private Residencia residencia;

	//bi-directional one-to-one association to Usuario
	@OneToOne
	@JoinColumn(name="id_cliente")
	private Usuario usuario;

	public Cliente() {
	}

	public Long getIdCliente() {
		return this.idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public String getNumeroDepartamento() {
		return this.numeroDepartamento;
	}

	public void setNumeroDepartamento(String numeroDepartamento) {
		this.numeroDepartamento = numeroDepartamento;
	}

	public Residencia getResidencia() {
		return this.residencia;
	}

	public void setResidencia(Residencia residencia) {
		this.residencia = residencia;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}