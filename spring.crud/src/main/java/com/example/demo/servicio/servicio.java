package com.example.demo.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.user;
import com.example.demo.repositorio.iuser;


@Service
public class servicio {
	
	@Autowired
	private iuser iuser; // interface
	
	public List<user> listAll(){
		return iuser.findAll();
	} 
	
	public void save( user us) {
		iuser.save(us);
	}
	
	public user get(Long id) { // optener un producto por id
		return iuser.findById(id).get();
	}
	
	public void delete(long id) {
		iuser.deleteById(id);
	}

}
