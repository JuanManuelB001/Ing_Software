package com.example.demo.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.equip;

import com.example.demo.repositorio.iequip;


@Service
public class equipServicio {
	
	@Autowired
	private iequip iequip; // interface
	
	public List<equip> listAll(){
		return iequip.findAll(); //listar
	} 
	
	public void saveequip( equip eq) {
		iequip.save(eq);
	}
	
	public equip getequip(Long id) { // optener un producto por id
		return iequip.findById(id).get();
	}
	
	public void deleteequip(long id) { //eliminar
		iequip.deleteById(id);
	}
}
