package com.example.demo.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.equip;
import com.example.demo.servicio.equipServicio;

@Controller
public class equipControl {
	
	@Autowired
	private equipServicio equipservicio;
	
	@RequestMapping("/formequip") // ver lista de equipo 
	public String pagequip(Model modelo) {
		List<equip> listaequip= equipservicio.listAll();
		modelo.addAttribute("listaequipo", listaequip);
//		return "index";
		return "indexequip";
	}
	
	@RequestMapping("/nuevoequip")
	public String moscarequip(Model model) {
		equip equipo= new equip();
		model.addAttribute("equipo", equipo);
		return "equip";
	}

}
