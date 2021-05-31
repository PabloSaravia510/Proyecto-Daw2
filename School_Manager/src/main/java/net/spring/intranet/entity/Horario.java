package net.spring.intranet.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;


@Entity
@Table(name = "tb_horario")
@Data
public class Horario implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "COD_HOR")
	private int codigoHorario;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "DES_HOR")
	private Date descripcionHorario; 
	
	
	//relacion de  horario a seccion
	@OneToMany(mappedBy = "horario")
	@JsonIgnore
	private List<Seccion> seccion;
	
}
