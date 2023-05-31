package com.example.demo.entity;


import jakarta.persistence.*;
//import jakarta.validation.constraints.Email;

@Entity	
public class user {
	
	@Id	
	@Column(nullable=false)
	
	private long id;
	
	@Column(nullable= false, length= 25)// NOT NULL
	private String nombre;
	
	@Column(nullable=false, length=25)
	//@Email(message="por favor ingrese un correo valido. ")
	private String email;
	
	@Column(nullable=false, length=10)
	private long telefono;
	
	@Column(nullable=false, length=50)
	private String direccion;
	
	@Column(nullable= false, length= 25)// NOT NULL
	private String marca;
	
	@Column(nullable=false, length=25)
	private String equipo;
	
	@Column(nullable=false, length=25)
	private String revisado;
	
	@Column(nullable=false, length=50)
	private String observacion;

	
	
	

	// Constructor 
	public user(long id, String nombre, String email, long telefono, String direccion, String marca,
			String equipo,String revisado, String observacion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.email = email;
		this.telefono = telefono;
		this.direccion = direccion;
		this.marca=marca;
		this.equipo=equipo;
		this.revisado=revisado;
		this.observacion=observacion;
	}

	public user() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	public String getRevisado() {
		return revisado;
	}

	public void setRevisado(String revisado) {
		this.revisado = revisado;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	
	
}
