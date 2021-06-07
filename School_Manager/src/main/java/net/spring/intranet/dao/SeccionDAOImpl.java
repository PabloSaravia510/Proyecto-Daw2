package net.spring.intranet.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.spring.intranet.entity.Asistencia;
import net.spring.intranet.entity.DetalleSeccionAlumno;
import net.spring.intranet.entity.DetalleSeccionAlumnoPK;
import net.spring.intranet.entity.Seccion;

@Repository
public class SeccionDAOImpl implements SeccionDAO{
	@Autowired
	private SessionFactory factory;
	
	@Override
	@Transactional
	public void actualizar(Seccion bean) {
		Session session = factory.getCurrentSession();
		try {
//			En lugar de todo este codigo comentado en este metodo, la actualziacion de la tabla Asistencia debe llamarse en el controlador de la seccion
			
			
			
			// buscamos antes de guardar para saber el valor del limite de clases
//			Seccion sec = buscar(bean.getCodigoSeccion());
			
			session.update(bean);
			
//			session = factory.getCurrentSession();
//			Query query = null;
//			try {
////				el limite de clases anterior vs el limite de clases asignado ahora
//				if(sec.getLclaSeccion()<bean.getLclaSeccion()) {
//					Asistencia bean2 = new Asistencia();
//					bean2.
//					
//					String hql = "update p from Asistencia p set p.NRO_CLA_ASI=:nro where p.COD_SEC=:cod";
//					query = session.createQuery(hql);
//					query.setParameter("cod", bean.getCodigoSeccion());
//					query.setParameter("nro", bean.getLclaSeccion());
//				}
//				if(sec.getLclaSeccion()>bean.getLclaSeccion()) {
//					String hql = "delete p from Asistencia p where p.NRO_CLA_ASI>nro";
//					query = session.createQuery(hql);
//					query.setParameter("nro", bean.getLclaSeccion());					
//				}
//			}
//			catch (Exception e) {
//				e.printStackTrace();
//			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	@Transactional
	public void eliminar(int cod) {
		Session session = factory.getCurrentSession();
		try {
			Seccion bean = session.get(Seccion.class, cod);
			session.delete(bean);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	@Transactional(readOnly = true)
	public List<Seccion> listarSecciones() {
		Session session = factory.getCurrentSession();
		Query query = null;
		try {
			String hql = "select p from Seccion p";
			query = session.createQuery(hql);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return query.getResultList();
	}

	@Override
	@Transactional(readOnly = true)
	public Seccion buscar(int cod) {
		Session session = factory.getCurrentSession();
		Seccion bean = null;
		try {
			bean = session.get(Seccion.class, cod);
			session.delete(bean);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bean;
	}

	@Override
	@Transactional
	public void insertar(Seccion bean) {
		Session session = factory.getCurrentSession();
		try {
//			guardar Cabecera
			session.save(bean);
			
//			guardar detalle
//			bucle
			for(DetalleSeccionAlumno dsa: bean.getListaDetalle()) {
				DetalleSeccionAlumnoPK pk = new DetalleSeccionAlumnoPK();
				pk.setCodigoSeccion(bean.getCodigoSeccion());
				pk.setCodigoAlumno(dsa.getAlumno().getCodigoAlumno());
				
//				enviar pk al objeto dsa
				dsa.setPk(pk);
				
//				guardar detalle
				session.save(dsa);
				
//				guardar detalle de detalle, recorre for hasta agotar el limite de clases por seccion
				for (int i = 1; i <= bean.getLclaSeccion(); i++) {
					Asistencia beanAsi = new Asistencia();
					beanAsi.setCodigoAsistencia(pk.getCodigoAlumno());
					beanAsi.setNumeroDeClaseAsistencia(i);
					beanAsi.setEstadoRegistro("INASISTIDO");
					session.save(beanAsi);
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	@Transactional
	public void actualizarAgregarAlumno(Seccion bean, int codAlu) {
		Session session = factory.getCurrentSession();
		
		DetalleSeccionAlumno dsa =  (DetalleSeccionAlumno) bean.getListaDetalle();
		
		DetalleSeccionAlumnoPK pk = new DetalleSeccionAlumnoPK();
		pk.setCodigoSeccion(bean.getCodigoSeccion());
		pk.setCodigoAlumno(codAlu);
		
//		enviar pk al objeto dsa
		dsa.setPk(pk);
		
//		guardar detalle
		session.save(dsa);
		
//		guardar detalle de detalle, recorre for hasta agotar el limite de clases por seccion
		for (int i = 1; i <= bean.getLclaSeccion(); i++) {
			Asistencia beanAsi = new Asistencia();
			beanAsi.setCodigoAsistencia(pk.getCodigoAlumno());
			beanAsi.setNumeroDeClaseAsistencia(i);
			beanAsi.setEstadoRegistro("INASISTIDO");
			session.save(beanAsi);
		}
	
	}

	@Override
	@Transactional
	public void actualizarQuitarAlumno(Seccion bean, int codAlu) {
		Session session = factory.getCurrentSession();
		
		DetalleSeccionAlumno dsa =  (DetalleSeccionAlumno) bean.getListaDetalle();
		
		DetalleSeccionAlumnoPK pk = new DetalleSeccionAlumnoPK();
		pk.setCodigoSeccion(bean.getCodigoSeccion());
		pk.setCodigoAlumno(codAlu);
		
//		enviar pk al objeto dsa
		dsa.setPk(pk);
		
//		guardar detalle
		session.delete(dsa);
		
//		guardar detalle de detalle, recorre for hasta agotar el limite de clases por seccion
		for (int i = 1; i <= bean.getLclaSeccion(); i++) {
			Asistencia beanAsi = new Asistencia();
			beanAsi.setCodigoAsistencia(pk.getCodigoAlumno());
			beanAsi.setNumeroDeClaseAsistencia(i);
			beanAsi.setEstadoRegistro("INASISTIDO");
			session.delete(beanAsi);
		}
	
	}

	@Override
	@Transactional(readOnly = true)
	public List<Seccion> consultarSeccionXProfesor(int codPro) {
		Session session = factory.getCurrentSession();
		Query query = null;
		try {
			String hql = "select s from Seccion s where profesor.codigoProfesor=?1";
			query = session.createQuery(hql);
			query.setParameter(1, codPro);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return query.getResultList();
	}
	

}
