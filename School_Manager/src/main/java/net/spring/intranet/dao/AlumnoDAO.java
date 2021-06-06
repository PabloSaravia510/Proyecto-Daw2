package net.spring.intranet.dao;

import net.spring.intranet.entity.Alumno;

public interface AlumnoDAO {
	public Alumno iniciarSesion(String user, String pass, int codRol);
}
