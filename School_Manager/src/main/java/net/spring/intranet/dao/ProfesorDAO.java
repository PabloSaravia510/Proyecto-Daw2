package net.spring.intranet.dao;

import java.util.List;

import net.spring.intranet.entity.Alumno;
import net.spring.intranet.entity.Profesor;

public interface ProfesorDAO {
	public Profesor iniciarSesion(String user, String pass, int codRol);
	
	public void actualizar(Profesor bean);
	
	public void eliminar(int cod);
	
	public List<Alumno> listarProfesores();
	
	public void buscar(int cod);
}
