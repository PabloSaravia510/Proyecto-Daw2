package net.spring.intranet.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name = "tb_det_sec_alu")
@Data
public class DetalleSeccionAlumno implements Serializable {

	
	@Id
	@Column(name = "COD_SEC")
	private int codigoSeccion;
	
	@Id
	@Column(name = "COD_ALU")
	private int codigoAlumno;
	

	
}
