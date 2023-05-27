package com.example.demo.entity;


import jakarta.persistence.*;

@Entity	
public class user {
	
	@Id	
	@Column(nullable=false)
	private long id;
	
	@Column(nullable= false, length= 50)// NOT NULL
	private String nombre;
	
	@Column(nullable=false, length=50)
	private String email;
	
	@Column(nullable=false, length=10)
	private long telefono;
	
	@Column(nullable=false, length=50)
	private String direccion;
	
	
	
	// Constructor 
	public user(long id, String nombre, String email, long telefono, String direccion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.email = email;
		this.telefono = telefono;
		this.direccion = direccion;
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
}
