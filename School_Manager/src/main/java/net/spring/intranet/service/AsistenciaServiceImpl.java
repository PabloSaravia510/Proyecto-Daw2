package net.spring.intranet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.spring.intranet.dao.AsistenciaDAO;
import net.spring.intranet.entity.Asistencia;

@Service
public class AsistenciaServiceImpl implements AsistenciaService{

	@Autowired
	private AsistenciaDAO asistenciaDAO;
	
	
	@Override
	public void insertar(Asistencia bean) {
		asistenciaDAO.insertar(bean);
		
	}

	@Override
	public List<Asistencia> listarAsistenciasxAlumnos(int codAlu) {
			return asistenciaDAO.listarAsistenciasxAlumnos(codAlu);
	}

	@Override
	public List<Asistencia> listarAsistencias() {
		return asistenciaDAO.listarAsistencias();
	}

	@Override
	public void eliminar(int cod) {
		asistenciaDAO.eliminar(cod);
		
	}

}
