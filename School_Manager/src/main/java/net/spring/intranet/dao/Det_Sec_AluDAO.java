package net.spring.intranet.dao;

import java.util.List;

import net.spring.intranet.entity.Alumno;
import net.spring.intranet.entity.Det_Sec_Alu;

public interface Det_Sec_AluDAO {

	
	
//public Alumno iniciarSesion(String user, String pass, int codRol);
	
	//public void eliminar(int cod);
	

	public List<Det_Sec_Alu> listarAlumnos();
	
	public void insertar(Det_Sec_Alu bean);
	
	public Det_Sec_Alu buscar(int codigo);
	
	public void actualizar(Det_Sec_Alu bean);
	
	
	//consulta
	public List<Det_Sec_Alu> consultarDetalleXAlumno(int codigoalu);
	
	
	
	//public Alumno buscar(int cod);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
