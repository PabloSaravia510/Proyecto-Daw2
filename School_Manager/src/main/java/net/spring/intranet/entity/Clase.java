package net.spring.intranet.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;



@Entity
@Table(name = "tb_clase")
@Data
public class Clase implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "COD_CLA")
	private int codigoClase;
	
	
	@Column(name = "EST_REG")
	private String estadoRegistro;
	
	//relacion de clase a seccion
	@ManyToOne
	@JoinColumn(name = "COD_SEC")
	private Seccion seccion;
	
	//relacion de clase a asistencia
	@OneToMany(mappedBy = "clase")
	@JsonIgnore
	private List<Asistencia> asistencia;
	
	
	
	
	
}
