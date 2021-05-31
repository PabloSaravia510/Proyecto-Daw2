package net.spring.intranet.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;


@Embeddable
@Data
public class DetalleSeccionAlumnoPK implements Serializable{

	@Column(name = "COD_SEC")
	private int codigoSeccion;
	@Column(name = "COD_ALU")
	private int codigoAlumno;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigoAlumno;
		result = prime * result + codigoSeccion;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DetalleSeccionAlumnoPK other = (DetalleSeccionAlumnoPK) obj;
		if (codigoAlumno != other.codigoAlumno)
			return false;
		if (codigoSeccion != other.codigoSeccion)
			return false;
		return true;
	}
	
	
	
	
	
}
