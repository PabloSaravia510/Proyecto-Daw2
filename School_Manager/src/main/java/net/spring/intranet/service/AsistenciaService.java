package net.spring.intranet.service;

import java.util.List;

import net.spring.intranet.entity.Asistencia;

public interface AsistenciaService {

	public void insertar(Asistencia bean);
	public void eliminar(int cod);
	public List<Asistencia> listarAsistencias();
	
	public List<Asistencia> listarAsistenciasxAlumnos(int codAlu);
}
