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
@Table(name = "tb_seccion")
@Data
public class Seccion implements Serializable {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "COD_SEC")
	private int codigoSeccion;
	
	@Column(name = "DES_SEC")
	private char descripcionSeccion;
	
	@Column(name = "DES_CURS")
	private String descripcionCurso;
	
	@Column(name = "NOTA_1")
	private int notaUno;
	
	@Column(name = "NOTA_2")
	private int notaDos;
	
	@Column(name = "COD_PRO")
	private int codigoProfesor;
	
	@Column(name = "COD_HOR")
	private int codigoHorario;
	
	@Column(name = "LFAL_SEC")
	private int lfalSeccion;
	
	@Column(name = "LCLA_SEC")
	private int lclaSeccion;
	
	@Column(name = "EST_REG")
	private char estadoRegistro;
	
	
	

	
	
	
}
