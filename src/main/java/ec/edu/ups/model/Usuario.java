package ec.edu.ups.model;

import javax.faces.application.FacesMessage;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

@Entity
public class Usuario {

	@Id
	@GeneratedValue
	@Column(name = "usu_codigo")
	private int codigo;
	
	@Column(name = "usu_username")
	private String username;

	@Email
	@Column(name = "per_email")
	private String correo;

	@NotNull
	@Size(min = 4, max = 20)
	@Column(name = "usu_password")
	private String password;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Usuario [codigo=" + codigo + ", correo=" + correo + ", password=" + password + "]";
	}

}
