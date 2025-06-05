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
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@Table(name = "tbl_solicitud")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Getter
@Setter
@NoArgsConstructor
public class Solicitud {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "nro_solicitud", nullable = false)
	@EqualsAndHashCode.Include
	private int nroSolicitud;
	
	
	@Column(name = "estado", nullable = false)
	private String estado;
	
	@Column(name = "archivo_adjunto", nullable = false)
	private String archivoAdjunto;
	
	@Column(name = "fecha_reg", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Date fechaReg;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_actividad")
	private Actividad actividad;

	
    public Solicitud(String estado, String archivoAdjunto, Actividad actividad) {
        this.estado = estado;
        this.archivoAdjunto = archivoAdjunto;
        this.actividad = actividad;
        this.fechaReg = new Date();
    }
    


}
