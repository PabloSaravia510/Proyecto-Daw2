package net.spring.intranet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.spring.intranet.dao.AdministradorDAO;
import net.spring.intranet.entity.Administrador;

@Service
public class AdministradorServiceImpl implements AdministradorService{

		@Autowired
		private AdministradorDAO administradorDAO;
	@Override
	public Administrador iniciarSesion(String user, String pass, int codRol) {
		
		return administradorDAO.iniciarSesion(user, pass, codRol);
	}

}
