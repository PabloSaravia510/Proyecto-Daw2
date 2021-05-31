package net.spring.intranet.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name = "tb_asistencia")
@Data
public class Asistencia implements Serializable{

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "COD_ASI")
	private int codigoAsistencia;
	
	@Column(name = "EST_REG")
	private char estadoRegistro;
	
	
	@ManyToOne
	@Column(name = "COD_ALU")
	private Alumno alumno;
	
	
	
	
	
	@Column(name = "COD_CLA")
	private int codigoClase;
	
	
	
	
	
	
	
	
	
	
	
	
	
}

