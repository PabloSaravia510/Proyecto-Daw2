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
@Table(name = "tb_profesor")
@Data
public class Profesor implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "COD_PRO")
	private int codigoProfesor;
	
	@Column(name = "NOM_PRO")
	private String nombreProfesor;
	
	@Column(name = "APE_PRO")
	private String apellidoProfesor;
	
	@Column(name = "USU_PRO")
	private char usuarioProfesor;
	
	@Column(name = "PASS_PRO")
	private char passProfesor;
	
	@Column(name = "EDAD_PRO")
	private int edadProfesor;
	
	@Column(name = "CEL_PRO")
	private char celularProfesor;
	
	@Column(name = "DIR_PRO")
	private String direccionProfesor;
	
	@Column(name = "ROL_USU")
	private int rolUsuario;
	
	@Column(name = "EST_REG")
	private char estadoRegistro;
	

	
}
