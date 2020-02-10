package ec.edu.ups.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import ec.edu.ups.dao.UsuarioDAO;
import ec.edu.ups.model.Usuario;

@ManagedBean
public class UsuarioBean {

	@Inject
	private UsuarioDAO udao;

	// private List<Usuario> usuarios;

	private Usuario usuario;

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@PostConstruct
	public void init() {
		this.usuario = new Usuario();
		System.out.println("usuario total " + usuario.toString());
	}

	public String validarUsuario() {

		String respuesta = "";
		System.out.println("LLego");
		String correo = usuario.getCorreo();
		System.out.println("corro " + correo);
		String password = usuario.getPassword();
		System.out.println("pass " + password);

		try {
			respuesta = udao.Login(correo, password);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("mesajeeee..  " + e.getMessage());
			e.printStackTrace();
		}
		 // String respuesta = udao.Login(correo, passwrod);
		System.out.println("respuesta " + respuesta);
		if (respuesta != "false")
			return "Matriculas";
		else
			datosUsuario();

		return null;
	}

	public void datosUsuario() {
		String puntos = "";
		String tamanio = usuario.getPassword();
		int tamanioPasword = tamanio.length();
		for (int i = 0; i < tamanioPasword; i++) {
			puntos += "*";
			
		}
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
				" Correo: " + usuario.getCorreo() + "	Password: " + puntos + "	No son Correctos..!!", ""));

	}

}
