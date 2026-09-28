package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tbl_especialidad")
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Especialidad {
	
	@Id
	@EqualsAndHashCode.Include
	@Column(name = "id_especialidad")
	private Integer idEspecialidad;
	
	@Column(name = "titulo")
	private String titulo;
	

}
