package com.ventas.Entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name ="provedor")
public class ProvedorEntity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id", nullable = false, length = 50)
	@GeneratedValue
	private long id;
	
	@NotEmpty(message="El campo nombre no puede ser vacio.")
	@Size(min=5, max=70, message="Tamaño del campo nombres no es válido.")
	@Column(name="nombre", nullable = false, length = 45)
	private String nombre;
	
	@NotEmpty(message="El campo fecha registro no puede ser vacio.")
	@Column(name="fechaRegistro", nullable = false, length = 45)
	private String fechaRegistro;
	
	@NotEmpty(message="El campo telefono no puede ser vacio.")
	@Size(min=6, max=8, message="Tamaño del campo telefono no es válido.")
	@Column(name="telefono", nullable = false, length = 8)
	private String telefono;
	
	@NotEmpty(message="El campo direccion no puede ser vacio.")
	@Column(name="direccion", nullable = false, length = 45)
	private String direccion;
	

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public long getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getFechaRegistro() {
		return fechaRegistro;
	}

	public String getTelefono() {
		return telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setFechaRegistro(String fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	

}
