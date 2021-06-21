package net.spring.intranet.dao;

import java.util.List;

import javax.persistence.ParameterMode;
import javax.persistence.Query;
import javax.persistence.StoredProcedureQuery;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.spring.intranet.entity.Administrador;

@Repository
public class AdministradorDAOImpl implements AdministradorDAO{

	@Autowired
	private SessionFactory factory;
	
	@Override
	@Transactional(readOnly = true)
	public Administrador iniciarSesion(String user, String pass, int codRol) {
		Session sesion = factory.getCurrentSession();
		StoredProcedureQuery query = null;
		Administrador bean = null;
		//Query query=null;
			try {
				query = sesion.createStoredProcedureQuery("SP_InicioSesion");
				query.registerStoredProcedureParameter("usuario", String.class, ParameterMode.IN);
				query.registerStoredProcedureParameter("passw", String.class, ParameterMode.IN);
				query.registerStoredProcedureParameter("coderol", Integer.class, ParameterMode.IN);
				
				query.setParameter("usuario", user);
				query.setParameter("passw", pass);
				query.setParameter("coderol", codRol);
				query.execute();
				//query = sesion.createQuery("call SP_InicioSesion(?,?,?)");
				//query.setParameter(1, user);
				//query.setParameter(2, pass);
				//query.setParameter(3, codRol);
				bean = (Administrador) query.getSingleResult();
			} catch (Exception e) {
				e.printStackTrace();
			}
		return  bean;
	}

}
