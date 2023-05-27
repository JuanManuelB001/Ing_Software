package com.example.demo.entity;


import jakarta.persistence.*;

@Entity	
public class equip {
	
	@Id	
	@GeneratedValue(strategy= GenerationType.IDENTITY) // autoincremental
	private long id;
	
	@Column(nullable= false, length= 50)// NOT NULL
	private String marca;
	
	@Column(nullable=false, length=50)
	private String equipo;
	
	@Column(nullable=false, length=10)
	private String revisado;
	
	@Column(nullable=false, length=50)
	private String observacion;

	// Constructor 
	
	public equip(long id, String marca, String equipo, String revisado, String observacion) {
		super();
		this.id = id;
		this.marca = marca;
		this.equipo = equipo;
		this.revisado = revisado;
		this.observacion = observacion;
	}

	public equip() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	
	
	
	
	
	
	//metodo 
//	public void agregar_id(equip leuip) {
//		if(equip_id == null) equip_id =new ArrayList<>(); 
//		//agrega el pedido 	
//		equip_id.add(leuip);
//		leuip.setUser_id(this); 
//		}
//	
//	// variable para la relacion entre tabla
//	@OneToMany(mappedBy="user_id",cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
//	private List<equip> equip_id;
//	
	
	

}
