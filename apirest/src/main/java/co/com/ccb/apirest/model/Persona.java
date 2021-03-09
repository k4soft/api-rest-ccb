package co.com.ccb.apirest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "persona")
@Data
@NoArgsConstructor
public class Persona {
	
	@Id
	@GeneratedValue
	@Column(name = "idpersona")
	private Integer idPersona;
	@Column(name = "numerodocumento")
	private String numeroDocumento;
	@ManyToOne
	@JoinColumn(name = "iddocumentoidentidad")
	private TipoDocumento tipoDocumento;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "apellido")
	private String apellido;
	@Column(name = "activo")
	private boolean activo;

	public TipoDocumento getTipoDocumento() {
		if(tipoDocumento == null) {
			tipoDocumento = new TipoDocumento();
		}
		return tipoDocumento;
	}

	

}
