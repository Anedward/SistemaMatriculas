package ec.edu.ups.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

@Entity
public class Materia {
	
	@Id

	@Column(name = "mat_codigo")
	private int codigo;
	
	@Column(name = "mat_nombre")
	private String nombre;
	
	@Column(name = "mat_nivel")
	private int nivel;
	
	
	//@Transient
	@OneToMany(mappedBy = "materia", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Curso> curso;
	



	


	public int getCodigo() {
		return codigo;
	}







	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}







	public String getNombre() {
		return nombre;
	}







	public void setNombre(String nombre) {
		this.nombre = nombre;
	}







	public int getNivel() {
		return nivel;
	}







	public void setNivel(int nivel) {
		this.nivel = nivel;
	}







	public List<Curso> getCurso() {
		return curso;
	}







	public void setCurso(List<Curso> curso) {
		this.curso = curso;
	}







	@Override
	public String toString() {
		return nombre;
	}
	
		
	
	
}
