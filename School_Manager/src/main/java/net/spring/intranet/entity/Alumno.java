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

import com.fasterxml.jackson.annotation.JsonIgnore;

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
	
	@Column(name = "EDAD_ALU")
	private int edadAlumno;
	
	@Column(name = "CEL_ALU")
	private char celularAlumno;
	
	@Column(name = "DIR_ALU")
	private String direccionAlumno;
	
	
	
	@Column(name = "EST_REG")
	private char estadoRegistro;
	
	
	@ManyToOne
	@Column(name = "COD_CAR")
	private Carrera carrera;
	
	
	
	//@ManyToOne
	//@Column(name = "COD_ROL")
	//private String codigoRol;
	
	
	
	@OneToMany(mappedBy = "alumno")
	@JsonIgnore
	private List<Asistencia> asistencia;
	
	
	
	
	
}
