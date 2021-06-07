package net.spring.intranet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.spring.intranet.dao.ProfesorDAO;
import net.spring.intranet.entity.Profesor;

@Service
public class ProfesorServiceImpl implements ProfesorService{
	
	@Autowired
	private ProfesorDAO profesorDAO;

	@Override
	public Profesor iniciarSesion(String user, String pass, int codRol) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertar(Profesor bean) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(Profesor bean) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(int cod) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Profesor> listarProfesores() {
		return profesorDAO.listarProfesores();
	}

	@Override
	public Profesor buscar(int cod) {
		// TODO Auto-generated method stub
		return null;
	}

}
