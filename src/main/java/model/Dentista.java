package model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.print.DocFlavor.STRING;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tbl_dentista")
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Dentista {
	
	@Id
	@EqualsAndHashCode.Include
	@Column(name = "id_dentista")
	private Integer idDentista;
	
	@Column(name = "cop")
	private String cop;

	@Column(name = "nombre_completo")
	private String nombreCompleto;

	@Column(name = "fecha_inicio_contrato")
	private Date fechaInicioContrato;
	
	@Column(name = "turno")
	private String turno;
	
	@Column(name = "correo")
	private String correo;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_especialidad")
	private Especialidad especialidad;
	
	public String toString() {
		return nombreCompleto;
	}
	
	public String getFullName() {
		return cop + " - " + nombreCompleto;
	}
}
