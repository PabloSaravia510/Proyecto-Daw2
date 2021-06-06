package net.spring.intranet.dao;

import net.spring.intranet.entity.Profesor;

public interface ProfesorDAO {
	public Profesor iniciarSesion(String user, String pass, int codRol);
}
