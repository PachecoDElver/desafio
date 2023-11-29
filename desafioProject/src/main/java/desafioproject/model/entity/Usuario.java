package desafioproject.model.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import static desafioproject.model.util.Functions.validaPattern;
import static desafioproject.model.util.Constants.MSSG_INVAL_USER_NOMBRE;
import static desafioproject.model.util.Constants.MSSG_INVAL_USER_CORREO;
import static desafioproject.model.util.Constants.MSSG_INVAL_USER_PASS;

import static desafioproject.model.util.Constants.PATTERN_USER_NOMBRE;
import static desafioproject.model.util.Constants.PATTERN_USER_CORREO;
import static desafioproject.model.util.Constants.PATTERN_USER_PASS;

import org.hibernate.annotations.GenericGenerator;

import desafioproject.model.exception.domain.NotAcceptable;

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable{

	private static final long serialVersionUID = -2131130712175521455L;

	@Id
	@GeneratedValue(generator = "uuid-hibernate-generator")
    @GenericGenerator(name = "uuid-hibernate-generator", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name = "id_usuario")
	private UUID idUsuario;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "correo")
	private String correo;
	
	@Column(name = "pass")
	private String pass;
	
	@Column(name = "fecha_creacion")
	private Date fechaCreacion;
	
	@Column(name = "fecha_modificacion")
	private Date fechaModificacion;
	
	@Column(name = "fecha_ultimo_login")
	private Date fechaUltimoLogin;
	
	@Column(name = "token")
	private String token;
	
	@Column(name = "isactive")
	private boolean activo;
	
	public UUID getIdUsuario() {
		return idUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public String getPass() {
		return pass;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setIdUsuario(UUID idUsuario) {
		this.idUsuario = idUsuario;
	}

	public void setNombre(String nombre) throws NotAcceptable {
		if(!validaPattern(nombre, PATTERN_USER_NOMBRE)) {
			throw new NotAcceptable(MSSG_INVAL_USER_NOMBRE);
		}
		this.nombre = nombre;
	}

	public void setCorreo(String correo) throws NotAcceptable {
		if(!validaPattern(correo, PATTERN_USER_CORREO)) {
			throw new NotAcceptable(MSSG_INVAL_USER_CORREO);
		}
		this.correo = correo;
	}

	public void setPass(String pass) throws NotAcceptable {
		if(!validaPattern(pass, PATTERN_USER_PASS)) {
			throw new NotAcceptable(MSSG_INVAL_USER_PASS);
		}
		this.pass = pass;
	}

	public void setActivo(boolean estado) {
		this.activo = estado;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public Date getFechaUltimoLogin() {
		return fechaUltimoLogin;
	}

	public String getToken() {
		return token;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public void setFechaUltimoLogin(Date fechaUltimoLogin) {
		this.fechaUltimoLogin = fechaUltimoLogin;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
}
