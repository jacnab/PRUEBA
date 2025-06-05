package model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tbl_categoria")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Getter
@Setter
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_categoria", nullable = false)
	@EqualsAndHashCode.Include
	private int idCategoria;
	
	@Column(name = "descripcion", nullable = false)
	private String descripcion;
	

}
