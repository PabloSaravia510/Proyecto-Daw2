package net.spring.intranet.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import net.spring.intranet.entity.Det_Sec_Alu;


@Repository
public class Det_Sec_AluDAOImpl implements Det_Sec_AluDAO{

	
	
	@Autowired
	private SessionFactory factory;
	
	
	
	@Override
	@Transactional(readOnly = true)
	public List<Det_Sec_Alu> listarAlumnos() {
		
		Session session = factory.getCurrentSession();
		Query query = null;
		try {
			String hql = "select d from Det_Sec_Alu d";
			query = session.createQuery(hql);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return query.getResultList();
	}
	
	

	@Override
	@Transactional
	public void insertar(Det_Sec_Alu bean) {
		
		Session session = factory.getCurrentSession();
		try {
			session.save(bean);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

	@Override
	@Transactional(readOnly = true)
	public Det_Sec_Alu buscar(int codigo) {
		
		Session session = factory.getCurrentSession();
		Det_Sec_Alu bean = null;
		try {
			bean = session.get(Det_Sec_Alu.class, codigo);
			session.delete(bean);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bean;
	}
	
	

	@Override
	@Transactional
	public void actualizar(Det_Sec_Alu bean) {
		
		Session session = factory.getCurrentSession();
		try {
			session.update(bean);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	
	@Override
	@Transactional(readOnly = true)
	public List<Det_Sec_Alu> consultarDetalleXAlumno(int codigoalu) {
		
		Session session = factory.getCurrentSession();
		Query query = null;
		try {
			String hql = "select d from Det_Sec_Alu d where alumno.codigoAlumno=?1";
			query = session.createQuery(hql);
			query.setParameter(1, codigoalu);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return query.getResultList();
	}

	
	
	
}
