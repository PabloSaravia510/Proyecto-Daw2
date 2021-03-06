package net.spring.intranet.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.spring.intranet.entity.Alumno;
//import net.spring.intranet.entity.DetalleSeccionAlumno;

@Repository
public class AlumnoDAOImpl implements AlumnoDAO{
	
	@Autowired
	private SessionFactory factory;
	
	@Override
	public Alumno iniciarSesion(String user, String pass, int codRol) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public void actualizar(Alumno bean) {
		Session session = factory.getCurrentSession();
		try {
			session.update(bean);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	@Transactional
	public void eliminar(int cod) {
		Session session = factory.getCurrentSession();
		try {
			Alumno bean = session.get(Alumno.class, cod);
			session.delete(bean);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	@Transactional(readOnly = true)
	public List<Alumno> listarAlumnos() {
		Session session = factory.getCurrentSession();
		Query query = null;
		try {
			String hql = "select p from Alumno p";
			query = session.createQuery(hql);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return query.getResultList();
	}

	@Override
	@Transactional(readOnly = true)
	public Alumno buscar(int cod) {
		Session session = factory.getCurrentSession();
		Alumno bean = null;
		try {
			bean = session.get(Alumno.class, cod);
			session.delete(bean);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bean;
	}

	@Override
	@Transactional
	public void insertar(Alumno bean) {
		Session session = factory.getCurrentSession();
		try {
			session.save(bean);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//	@Override
//	public List<Alumno> consultarAlumnosXSeccion(int codSeccion) {
//		Session session = factory.getCurrentSession();
//		Query query = null;
//		try {
//			String hql = "select p from Alumno p where p.COD_SEC:=cod";
//			query = session.createQuery(hql);
//			query.setParameter("cod", codSeccion);
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}
//		return query.getResultList();
//	}

	@Override
	@Transactional(readOnly = true)
	public List<Alumno> consultarAlumnosXCarrera(int codCarrera) {
		Session session = factory.getCurrentSession();
		Query query = null;
		try {
			String hql = "select p from Alumno p where carrera.codigoCarrera=?1";
			query = session.createQuery(hql);
			query.setParameter(1, codCarrera);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return query.getResultList();
	}

}
