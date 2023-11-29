package desafioproject.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import desafioproject.model.exception.domain.NotAcceptable;

import static desafioproject.model.util.Functions.validaPattern;
import static desafioproject.model.util.Constants.PATTERN_TELEF_NUM;
import static desafioproject.model.util.Constants.PATTERN_TELEF_COD_PAIS;
import static desafioproject.model.util.Constants.PATTERN_TELEF_COD_CIUDAD;
import static desafioproject.model.util.Constants.MSSG_INVAL_TELEF_NUM;
import static desafioproject.model.util.Constants.MSSG_INVAL_TELEF_COD_PAIS;
import static desafioproject.model.util.Constants.MSSG_INVAL_TELEF_COD_CIUDAD;

@Entity
@Table(name = "telefono")
public class Telefono implements Serializable{
	
	private static final long serialVersionUID = 1714311843922895584L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_telefono")
	private Long idTelefono;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;
	
	@Column(name = "numero")
	private String numero;
	
	@Column(name = "codigo_ciudad")
	private String codigoCiudad;
	
	@Column(name = "codigo_pais")
	private String codigoPais;

	public Long getIdTelefono() {
		return idTelefono;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public String getNumero() {
		return numero;
	}

	public String getCodigoCiudad() {
		return codigoCiudad;
	}

	public String getCodigoPais() {
		return codigoPais;
	}

	public void setIdTelefono(Long idTelefono) {
		this.idTelefono = idTelefono;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public void setNumero(String numero) throws NotAcceptable {
		if(!validaPattern(numero, PATTERN_TELEF_NUM)) {
			throw new NotAcceptable(MSSG_INVAL_TELEF_NUM);
		}
		this.numero = numero;
	}

	public void setCodigoCiudad(String codigoCiudad) throws NotAcceptable{
		if(!validaPattern(codigoCiudad, PATTERN_TELEF_COD_CIUDAD)) {
			throw new NotAcceptable(MSSG_INVAL_TELEF_COD_CIUDAD);
		}
		this.codigoCiudad = codigoCiudad;
	}

	public void setCodigoPais(String codigoPais) throws NotAcceptable{
		if(!validaPattern(codigoPais, PATTERN_TELEF_COD_PAIS)) {
			throw new NotAcceptable(MSSG_INVAL_TELEF_COD_PAIS);
		}
		this.codigoPais = codigoPais;
	}

}
