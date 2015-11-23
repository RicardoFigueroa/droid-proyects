package com.pe.droid.appquejas.domain;

import java.io.Serializable;

import javax.persistence.*;

import java.text.SimpleDateFormat;
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
	private String fotoQuejaCliente;

	@Lob
	@Column(name="foto_queja_verificacion")
	private String fotoQuejaVerificacion;

	@Column(name="id_cliente")
	private Integer idCliente;

	@Column(name="id_queja_estado")
	private Integer idQuejaEstado;

	@Column(name="id_queja_gravedad")
	private Integer idQuejaGravedad;

	@Column(name="id_trabajador")
	private Integer idTrabajador;

	@Column(name="id_zona")
	private Integer idZona;

	@Column(name="latitud_creacion")
	private Double latitudCreacion;

	@Column(name="latitud_verificacion")
	private Double latitudVerificacion;

	@Column(name="longitud_creacion")
	private Double longitudCreacion;

	@Column(name="longitud_verificacion")
	private Double longitudVerificacion;

	@Column(name="titulo_queja")
	private String tituloQueja;
	
	@Column(name="observacion_cliente")
	private String observacionCliente;

	@Column(name="observacion_trabajador")
	private String observacionTrabajador;
	
	@Transient
	private String fechaCreacionString;
	
	@Transient
	private String nombreCliente;
	
	@Transient
	private String nombreEstado;

	@Transient
	private String nombreTrabajador;
	
	public Queja() {
	}

	public Long getIdQueja() {
		return idQueja;
	}

	public void setIdQueja(Long idQueja) {
		this.idQueja = idQueja;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Date getFechaVerificacion() {
		return fechaVerificacion;
	}

	public void setFechaVerificacion(Date fechaVerificacion) {
		this.fechaVerificacion = fechaVerificacion;
	}

	public String getFotoQuejaCliente() {
		return fotoQuejaCliente;
	}

	public void setFotoQuejaCliente(String fotoQuejaCliente) {
		this.fotoQuejaCliente = fotoQuejaCliente;
	}

	public String getFotoQuejaVerificacion() {
		return fotoQuejaVerificacion;
	}

	public void setFotoQuejaVerificacion(String fotoQuejaVerificacion) {
		this.fotoQuejaVerificacion = fotoQuejaVerificacion;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public Integer getIdQuejaEstado() {
		return idQuejaEstado;
	}

	public void setIdQuejaEstado(Integer idQuejaEstado) {
		this.idQuejaEstado = idQuejaEstado;
	}

	public Integer getIdQuejaGravedad() {
		return idQuejaGravedad;
	}

	public void setIdQuejaGravedad(Integer idQuejaGravedad) {
		this.idQuejaGravedad = idQuejaGravedad;
	}

	public Integer getIdTrabajador() {
		return idTrabajador;
	}

	public void setIdTrabajador(Integer idTrabajador) {
		this.idTrabajador = idTrabajador;
	}

	public Integer getIdZona() {
		return idZona;
	}

	public void setIdZona(Integer idZona) {
		this.idZona = idZona;
	}

	public Double getLatitudCreacion() {
		return latitudCreacion;
	}

	public void setLatitudCreacion(Double latitudCreacion) {
		this.latitudCreacion = latitudCreacion;
	}

	public Double getLatitudVerificacion() {
		return latitudVerificacion;
	}

	public void setLatitudVerificacion(Double latitudVerificacion) {
		this.latitudVerificacion = latitudVerificacion;
	}

	public Double getLongitudCreacion() {
		return longitudCreacion;
	}

	public void setLongitudCreacion(Double longitudCreacion) {
		this.longitudCreacion = longitudCreacion;
	}

	public Double getLongitudVerificacion() {
		return longitudVerificacion;
	}

	public void setLongitudVerificacion(Double longitudVerificacion) {
		this.longitudVerificacion = longitudVerificacion;
	}

	public String getTituloQueja() {
		return tituloQueja;
	}

	public void setTituloQueja(String tituloQueja) {
		this.tituloQueja = tituloQueja;
	}

	public String getObservacionCliente() {
		return observacionCliente;
	}

	public void setObservacionCliente(String observacionCliente) {
		this.observacionCliente = observacionCliente;
	}

	public String getObservacionTrabajador() {
		return observacionTrabajador;
	}

	public void setObservacionTrabajador(String observacionTrabajador) {
		this.observacionTrabajador = observacionTrabajador;
	}

	public String getFechaCreacionString() {
		Date fecha = getFechaCreacion();
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		return format.format(fecha);
	}

	public void setFechaCreacionString(String fechaCreacionString) {
		this.fechaCreacionString = fechaCreacionString;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getNombreEstado() {
		return nombreEstado;
	}

	public void setNombreEstado(String nombreEstado) {
		this.nombreEstado = nombreEstado;
	}

	public String getNombreTrabajador() {
		return nombreTrabajador;
	}

	public void setNombreTrabajador(String nombreTrabajador) {
		this.nombreTrabajador = nombreTrabajador;
	}




	
}