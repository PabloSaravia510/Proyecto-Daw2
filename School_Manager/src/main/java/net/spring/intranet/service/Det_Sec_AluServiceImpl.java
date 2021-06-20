package net.spring.intranet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import net.spring.intranet.dao.AlumnoDAO;
import net.spring.intranet.dao.Det_Sec_AluDAO;
import net.spring.intranet.entity.Det_Sec_Alu;

public class Det_Sec_AluServiceImpl implements Det_Sec_AluService{

	
	@Autowired
	private Det_Sec_AluDAO Det_Sec_AluDAO;
	
	
	@Override
	public List<Det_Sec_Alu> listarAlumnos() {
		return Det_Sec_AluDAO.listarAlumnos();
		
	}

	@Override
	public void insertar(Det_Sec_Alu bean) {
		Det_Sec_AluDAO.insertar(bean);
		
	}

	@Override
	public Det_Sec_Alu buscar(int codigo) {
		return Det_Sec_AluDAO.buscar(codigo);
	}

	@Override
	public void actualizar(Det_Sec_Alu bean) {
		Det_Sec_AluDAO.actualizar(bean);
		
	}
	

	@Override
	public List<Det_Sec_Alu> consultarDetalleXAlumno(int codigoalu) {
		return Det_Sec_AluDAO.consultarDetalleXAlumno(codigoalu);
	}

}
