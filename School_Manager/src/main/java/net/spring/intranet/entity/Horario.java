package net.spring.intranet.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;


@Entity
@Table(name = "tb_horario")
@Data
public class Horario implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "COD_CAR")
	private int codigoHorario;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "DES_HOR")
	private Date descripcionHorario; 
	
	
	
	
	
}
