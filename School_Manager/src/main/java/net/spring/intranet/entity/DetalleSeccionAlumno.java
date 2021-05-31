package net.spring.intranet.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "tb_det_sec_alu")
@Data
public class DetalleSeccionAlumno implements Serializable {

	@EmbeddedId
	private DetalleSeccionAlumnoPK pk;

	// relacion de muchos a uno con alumno
	@ManyToOne
	@JoinColumn(name = "COD_ALU", referencedColumnName = "COD_ALU", insertable = false, updatable = false)
	private Alumno alumno;

	// relacion de muchos a uno con seccion
	@ManyToOne
	@JoinColumn(name = "COD_SEC", referencedColumnName = "COD_SEC", insertable = false, updatable = false)
	private Seccion seccion;
	
	
	
	
	
	

}
