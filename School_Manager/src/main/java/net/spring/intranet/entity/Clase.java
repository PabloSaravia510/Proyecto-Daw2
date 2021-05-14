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
@Table(name = "tb_clase")
@Data
public class Clase implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "COD_CLA")
	private int codigoClase;
	
	@Column(name = "COD_SEC")
	private int codigoSeccion;
	
	@Column(name = "EST_REG")
	private char estadoRegistro;
	
	
	
}
