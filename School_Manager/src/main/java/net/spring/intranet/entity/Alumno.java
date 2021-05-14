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
@Table(name = "tb_alumno")
@Data
public class Alumno implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "COD_ALU")
	private int codigoAlumno;
	
	@Column(name = "NOM_ALU")
	private String nombreAlumno;
	
	@Column(name = "APE_ALU")
	private String apellidoAlumno;
	
	@Column(name = "USU_ALU")
	private char usuarioAlumno;
	
	@Column(name = "PASS_ALU")
	private char passAlumno;
	
	@Column(name = "COD_CAR")
	private int codigoCarrera;
	
	@Column(name = "EDAD_ALU")
	private int edadAlumno;
	
	@Column(name = "CEL_ALU")
	private char celularAlumno;
	
	@Column(name = "DIR_ALU")
	private String direccionAlumno;
	
	@Column(name = "ROL_USU")
	private int rolUsuario;
	
	@Column(name = "EST_REG")
	private char estadoRegistro;
	
	
	
}
