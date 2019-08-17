package com.ventas.VO;

import java.util.Date;

public class ProvedorVO {
	private long id;
	private String nombre;
	private String fechaRegistro;
	private String telefono;
	private String direccion;
	
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
