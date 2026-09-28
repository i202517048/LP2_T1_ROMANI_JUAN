package model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.bytebuddy.asm.Advice.Return;

@Entity
@Table(name = "tbl_equipo_dental")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@DynamicInsert
public class EquipoDental {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "nro_equipo")
	private Integer nroEquipo;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "costo")
	private BigDecimal costo;

	@Column(name = "fecha_adquisicion")
	private LocalDateTime fechaAdquisicion;			//LocalDateTime

	@Column(name = "estado")
	private String estado;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_dentista")
	private Dentista dentista;

	public String getNombreEstado() {
		switch (estado) {
		case "N":
			return "Nuevo";

		case "R":
			return "Reparado";

		case "A":
			return "Activo";
			
		case "S":
			return "Suspendido";

		default:
			return "Desconocido";
		}
	}

}
