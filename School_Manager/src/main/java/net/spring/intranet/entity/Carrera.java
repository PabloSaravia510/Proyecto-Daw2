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
@Table(name = "tb_carrera")
@Data
public class Carrera implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "COD_CAR")
	private int codigoCarrera;
	
	@Column(name = "DES_CAR")
	private String descripcionCarrera;
	
	@Column(name = "EST_REG")
	private char estadoRegistro;
	
	
	
	

	
	
}
