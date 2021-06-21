package net.spring.intranet.service;

import java.util.List;

import net.spring.intranet.entity.Administrador;

public interface AdministradorService {
	public Administrador iniciarSesion(String user, String pass, int codRol);
}
