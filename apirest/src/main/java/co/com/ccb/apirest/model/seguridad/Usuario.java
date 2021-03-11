package co.com.ccb.apirest.model.seguridad;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name ="usuario")
@Data
@NoArgsConstructor
public class Usuario {
	
	@Id
	private Integer idUsuario;
	@Column(unique = true, length = 20)
	private String nombreUsuario;
	@Column( length = 60)
	private String password;
	private boolean enabled;
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(name= "users_authorities", joinColumns = @JoinColumn(name="id_usuario"), inverseJoinColumns = @JoinColumn(name="id_rol"), uniqueConstraints = {@UniqueConstraint(columnNames = {"id_usuario","id_rol"})})
	private List<Rol> roles;
	

}
