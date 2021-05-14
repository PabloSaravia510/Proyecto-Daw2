package net.spring.intranet.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name = "tb_geolocalizacion")
@Data
public class Geolocalizacion implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "COD_GEO")
	private int codigoGeolocalizacion;
	
	@Column(name = "COR_GEO")
	private char cordenadaGeolocalizacion;
	
	@Column(name = "COD_ALU")
	private int codigoAlumno;
	
	
	
	
}
