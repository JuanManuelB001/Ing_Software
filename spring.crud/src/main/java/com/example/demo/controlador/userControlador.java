
package com.example.demo.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.user;
import com.example.demo.servicio.servicio;

@Controller
public class userControlador {

	@Autowired
	private servicio servicio;

	@RequestMapping("/")
	public String pagInicio(Model model) {
		List<user> listausuario = servicio.listAll();

		model.addAttribute("listusuarios", listausuario); // optener los productos BD
		return "index";

	}

	@RequestMapping("/crearSesion") // metodo getter para thymeleaf
	public String crearsesion(Model model) {
		user user = new user();
		model.addAttribute("formulario", user);
		return "crearSesion";
	}

	@RequestMapping("/crearUsuario") // metodo getter para thymeleaf
	public String crearUsuario(Model model) {
		user user = new user();
		model.addAttribute("formulario", user);
		return "userForm";
	}

	@RequestMapping("/listarUsuarios")
	public Object listUsers(Model model) {

		// Consultar el endpoint externo y obtener la respuesta
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Object[]> response = restTemplate.getForEntity("http://localhost:9098/users", Object[].class);
		Object[] usuariosExternos = response.getBody();

		// // Agregar los usuarios externos al modelo
		model.addAttribute("listUsuarios", usuariosExternos);
		return "usersList";

	}

	@RequestMapping("/info")
	public String info() {
		return "info";
	}

	// Guardar en la tabla
	@RequestMapping(value = "/guardar", method = RequestMethod.POST)
	public String guardar(@ModelAttribute("formulario") user user) {
		servicio.save(user);
		return "redirect:/";
	}

	// Guardar en la tabla
	@RequestMapping(value = "/saveUser", method = RequestMethod.POST)
	public String saveUser(@ModelAttribute("formulario") user user) {
		// servicio.save(user);
		return user;
	}

	@RequestMapping("/editar/{id}") // metodo getter para thymeleaf
	public ModelAndView editarusuario(@PathVariable(name = "id") long id) {
		ModelAndView modelo = new ModelAndView("editar_usuario"); // vista
		user user = servicio.get(id);
		modelo.addObject("producto", user);
		return modelo;
	}

}
