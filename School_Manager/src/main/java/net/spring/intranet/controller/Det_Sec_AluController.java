package net.spring.intranet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import net.spring.intranet.service.AlumnoService;

import net.spring.intranet.service.Det_Sec_AluService;

import net.spring.intranet.service.SeccionService;



@Controller
@RequestMapping(value = "/vDetalle")
public class Det_Sec_AluController {

	
	
	@Autowired
	private AlumnoService AlumnoService;
	
	@Autowired 
	private Det_Sec_AluService Det_Sec_AluService;
	
	@Autowired
	private SeccionService SeccionService;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
