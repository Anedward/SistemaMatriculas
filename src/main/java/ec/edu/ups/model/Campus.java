package ec.edu.ups.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Campus {

	@Id
	@Column(name = "cam_codigo")
	private int codigo;
	
	@Column(name = "cam_nombre")
	private String nombre;
	
	@ManyToOne()
	@JoinColumn()
	private Sede sede;
	
	@OneToMany(mappedBy = "campus", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
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

	public Sede getSede() {
		return sede;
	}

	public void setSede(Sede sede) {
		this.sede = sede;
	}

	public List<CampusCarrera> getCc() {
		return cc;
	}

	public void setCc(List<CampusCarrera> cc) {
		this.cc = cc;
	}
	
	
}
