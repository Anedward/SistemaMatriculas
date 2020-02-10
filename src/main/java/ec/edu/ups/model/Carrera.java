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
public class Carrera {

	@Id
	@Column(name = "car_codigo")
	private int codigo;
	
	@Column(name = "car_nombre")
	private String nombre;
	
	@Column(name = "car_tipo")
	private String tipo;
	
	@Transient
	@OneToMany(mappedBy = "carrera", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<CampusCarrera> cc;

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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

		public List<CampusCarrera> getCc() {
		return cc;
	}

	public void setCc(List<CampusCarrera> cc) {
		this.cc = cc;
	}

	@Override
	public String toString() {
		return  nombre;
	}
	
		
}
