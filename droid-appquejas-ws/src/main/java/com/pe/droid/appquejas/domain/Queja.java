package com.pe.droid.appquejas.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the queja2 database table.
 * 
 */
@Entity
@Table(name="queja")
@NamedQuery(name="Queja.findAll", query="SELECT q FROM Queja q")
public class Queja implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_queja")
	private Long idQueja;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_creacion")
	private Date fechaCreacion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_verificacion")
	private Date fechaVerificacion;

	@Lob
	@Column(name="foto_queja_cliente")
	private byte[] fotoQuejaCliente;

	@Lob
	@Column(name="foto_queja_verificacion")
	private byte[] fotoQuejaVerificacion;

	@Column(name="id_cliente")
	private int idCliente;

	@Column(name="id_queja_estado")
	private int idQuejaEstado;

	@Column(name="id_queja_gravedad")
	private int idQuejaGravedad;

	@Column(name="id_trabajador")
	private int idTrabajador;

	@Column(name="id_zona")
	private int idZona;

	@Column(name="latitud_creacion")
	private double latitudCreacion;

	@Column(name="latitud_verificacion")
	private double latitudVerificacion;

	@Column(name="longitud_creacion")
	private double longitudCreacion;

	@Column(name="longitud_verificacion")
	private double longitudVerificacion;

	@Column(name="titulo_queja")
	private String tituloQueja;
	
	@Column(name="observacion_cliente")
	private String observacionCliente;

	@Column(name="observacion_trabajador")
	private String observacionTrabajador;

	public Queja() {
	}

	public Long getIdQueja() {
		return this.idQueja;
	}

	public void setIdQueja(Long idQueja) {
		this.idQueja = idQueja;
	}

	public Date getFechaCreacion() {
		return this.fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Date getFechaVerificacion() {
		return this.fechaVerificacion;
	}

	public void setFechaVerificacion(Date fechaVerificacion) {
		this.fechaVerificacion = fechaVerificacion;
	}

	public byte[] getFotoQuejaCliente() {
		return this.fotoQuejaCliente;
	}

	public void setFotoQuejaCliente(byte[] fotoQuejaCliente) {
		this.fotoQuejaCliente = fotoQuejaCliente;
	}

	public byte[] getFotoQuejaVerificacion() {
		return this.fotoQuejaVerificacion;
	}

	public void setFotoQuejaVerificacion(byte[] fotoQuejaVerificacion) {
		this.fotoQuejaVerificacion = fotoQuejaVerificacion;
	}

	public int getIdCliente() {
		return this.idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public int getIdQuejaEstado() {
		return this.idQuejaEstado;
	}

	public void setIdQuejaEstado(int idQuejaEstado) {
		this.idQuejaEstado = idQuejaEstado;
	}

	public int getIdQuejaGravedad() {
		return this.idQuejaGravedad;
	}

	public void setIdQuejaGravedad(int idQuejaGravedad) {
		this.idQuejaGravedad = idQuejaGravedad;
	}

	public int getIdTrabajador() {
		return this.idTrabajador;
	}

	public void setIdTrabajador(int idTrabajador) {
		this.idTrabajador = idTrabajador;
	}

	public int getIdZona() {
		return this.idZona;
	}

	public void setIdZona(int idZona) {
		this.idZona = idZona;
	}

	public double getLatitudCreacion() {
		return this.latitudCreacion;
	}

	public void setLatitudCreacion(double latitudCreacion) {
		this.latitudCreacion = latitudCreacion;
	}

	public double getLatitudVerificacion() {
		return this.latitudVerificacion;
	}

	public void setLatitudVerificacion(double latitudVerificacion) {
		this.latitudVerificacion = latitudVerificacion;
	}

	public double getLongitudCreacion() {
		return this.longitudCreacion;
	}

	public void setLongitudCreacion(double longitudCreacion) {
		this.longitudCreacion = longitudCreacion;
	}

	public double getLongitudVerificacion() {
		return this.longitudVerificacion;
	}

	public void setLongitudVerificacion(double longitudVerificacion) {
		this.longitudVerificacion = longitudVerificacion;
	}

	public String getObservacionCliente() {
		return this.observacionCliente;
	}

	public void setObservacionCliente(String observacionCliente) {
		this.observacionCliente = observacionCliente;
	}

	public String getObservacionTrabajador() {
		return this.observacionTrabajador;
	}

	public void setObservacionTrabajador(String observacionTrabajador) {
		this.observacionTrabajador = observacionTrabajador;
	}

	public String getTituloQueja() {
		return tituloQueja;
	}

	public void setTituloQueja(String tituloQueja) {
		this.tituloQueja = tituloQueja;
	}

	
}