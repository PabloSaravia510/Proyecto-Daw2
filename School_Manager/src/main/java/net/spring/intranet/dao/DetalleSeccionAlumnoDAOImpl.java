package net.spring.intranet.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import net.spring.intranet.entity.DetalleSeccionAlumno;

public class DetalleSeccionAlumnoDAOImpl implements DetalleSeccionAlumnoDAO{
	
	@Autowired
	private SessionFactory factory;

	@Override
	@Transactional(readOnly = true)
	public DetalleSeccionAlumno buscar(int codSeccion) {
		Session session = factory.getCurrentSession();
		DetalleSeccionAlumno bean = null;
		try {
			bean = session.get(DetalleSeccionAlumno.class, codSeccion);
			session.delete(bean);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bean;
	}

}
