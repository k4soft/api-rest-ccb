package co.com.ccb.tipodocumento.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "tipodocumento")
@NoArgsConstructor
@AllArgsConstructor
public class TipoDocumento {
	@Id
	@Column(name="idtipodocumento")
	private Integer idTipoDocumento;
	@Column(name="nombredocumento")
	private String nombreDocumento;
	@Transient
	private Integer port;
}
