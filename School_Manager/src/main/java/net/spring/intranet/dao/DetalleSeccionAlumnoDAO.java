package net.spring.intranet.dao;

import net.spring.intranet.entity.DetalleSeccionAlumno;

public interface DetalleSeccionAlumnoDAO {
//	una vez obtenidos todos los alumnos de X seccion
//	en el controlador se debe poner un foreach, de los codigos de alumnos que devuelva aqui
//		donde en cada iteracion, se obtiene los datos de un alumno
//		y se añade el alumno al arreglo de alumnos a mostrar en la vista
	public DetalleSeccionAlumno buscar(int codSeccion);
}
