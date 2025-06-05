package model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tbl_actividad")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Getter
@Setter

public class Actividad {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_actividad", nullable = false)
	@EqualsAndHashCode.Include
	private int idActividad;
	
	@Column(name = "descripcion", nullable = false)
	private String descripcion;
	
	@Column(name = "fecha_inicio", nullable = false)
	private Date fechaInicio;
	
	@Column(name = "nro_vacantes", nullable = false, columnDefinition = "int default 100")
	private int nroVacantes;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_categoria")
	private Categoria categoria;

	
	@Override
	public String toString() {
	    return descripcion; 
	}


}
