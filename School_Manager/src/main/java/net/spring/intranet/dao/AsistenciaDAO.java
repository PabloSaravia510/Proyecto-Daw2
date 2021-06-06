package net.spring.intranet.dao;

import java.util.List;

import net.spring.intranet.entity.Asistencia;

public interface AsistenciaDAO {
	public void actualizar(Asistencia bean);
	
//	agregar n filas de asistencia a tb_asistencia cuando se añade un alumno a la seccion
//	donde n es el limite de clases
	public void agregar(Asistencia bean);
	
//	quitar n filas de asistencia a tb_asistencia cuando se añade un alumno a la seccion
//	donde n es el limite de clases
	public void eliminar(int cod);
	
	public List<Asistencia> listarAsistencias();
}
