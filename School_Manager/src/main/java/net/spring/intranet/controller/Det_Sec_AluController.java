package net.spring.intranet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import net.spring.intranet.entity.Alumno;
import net.spring.intranet.entity.Carrera;
import net.spring.intranet.entity.Det_Sec_Alu;
import net.spring.intranet.entity.Rol;
import net.spring.intranet.entity.Seccion;
import net.spring.intranet.service.AlumnoService;

import net.spring.intranet.service.Det_Sec_AluService;

import net.spring.intranet.service.SeccionService;



@Controller
@RequestMapping(value = "/detalle")
public class Det_Sec_AluController {

	
	
	@Autowired
	private AlumnoService AlumnoService;
	
	@Autowired 
	private Det_Sec_AluService Det_Sec_AluService;
	
	@Autowired
	private SeccionService SeccionService;
	
	
	@RequestMapping(value = "/")
	public String index(Model model) {
		model.addAttribute("alumno", AlumnoService.listarAlumnos());
		model.addAttribute("detalle", Det_Sec_AluService.listarAlumnos());
		model.addAttribute("secciones", SeccionService.listarSecciones());
		model.addAttribute("Det_Sec_Alu", new Det_Sec_Alu());
		
		return "vDetalle";
	}
	
	
	
	//actualizar y insertar
	@RequestMapping(value = "/guardar")
	public String grabarAlumno(@RequestParam("codigo")int cod,
								@RequestParam("nota1")int nota1,
								@RequestParam("nota2")int nota2,
								@RequestParam("seccion")int codsec,
								@RequestParam("alumno")int codalu,RedirectAttributes redirect) {
		try {
			Det_Sec_Alu beanAlu =  new Det_Sec_Alu();
			beanAlu.setCodSecAlu(cod);
			beanAlu.setNota1(nota1);
			beanAlu.setNota2(nota2);
			
			Seccion sec = new Seccion();
			sec.setCodigoSeccion(codsec);
			beanAlu.setSeccion(sec);
		
			Alumno alu = new Alumno();
			alu.setCodigoAlumno(codalu);
			beanAlu.setAlumno(alu);
			
			
			if(cod==0) {
				Det_Sec_AluService.insertar(beanAlu);
				//crear atributo
				redirect.addFlashAttribute("MENSAJE","Registro exitoso");
			}
			else {
				Det_Sec_AluService.actualizar(beanAlu);
				redirect.addFlashAttribute("MENSAJE","Registro actualizado");
			}
			
		} catch (Exception e) {
			redirect.addFlashAttribute("MENSAJE","Error al registrar");
			e.printStackTrace();
		}
		return "redirect:/detalle/";
	}
	
	
	
	
	
	@RequestMapping(value = "/buscarAlumno")
	@ResponseBody
	public Det_Sec_Alu buscarAlumno(@RequestParam("cod") int cod) {
		Det_Sec_Alu bean=Det_Sec_AluService.buscar(cod);
		return bean;
	} 
	
	
	@RequestMapping(value = "/consulta")
	@ResponseBody
	public List<Det_Sec_Alu> consulta(@RequestParam("codigo")int codAlumno){
		return Det_Sec_AluService.consultarDetalleXAlumno(codAlumno);
	}
	
	
	@RequestMapping("/filtro")
	public String listaDetalleXAlumno(Model model) {
		model.addAttribute("alumno",AlumnoService.listarAlumnos());
		return "vConsultaDetallexAlumno";
	}
	
	
	
	
	
}
