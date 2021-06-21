package net.spring.intranet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import net.spring.intranet.service.AdministradorService;

@Controller
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private AdministradorService administradorService;
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/InicioSesion")
	public String login(@RequestParam("usuario") String usuario,
						@RequestParam("password") String password,
						@RequestParam("rol") int codRol,
						RedirectAttributes redirect) {
		try {
			administradorService.iniciarSesion(usuario, password, codRol);
			redirect.addFlashAttribute("MENSAJE", "Iniciaste Sesión");
		} catch (Exception e) {
			redirect.addFlashAttribute("MENSAJE", "Hubo un error Al iniciar Sesión");
			e.printStackTrace();
		}
		return "redirect:/principal/";
	}
}
