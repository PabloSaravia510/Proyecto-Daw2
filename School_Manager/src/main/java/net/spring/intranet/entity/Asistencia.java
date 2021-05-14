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
@Table(name = "tb_asistencia")
@Data
public class Asistencia implements Serializable{

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "COD_ASI")
	private int codigoAsistencia;
	
	@Column(name = "COD_ALU")
	private int codigoAlumno;
	
	@Column(name = "COD_CLA")
	private int codigoClase;
	
	@Column(name = "EST_REG")
	private char estadoRegistro;
	
	
}

