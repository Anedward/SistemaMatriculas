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
public class CampusCarrera {

	@Id
	@Column(name = "cc_codigo")
	private int codigo;

	@Column(name = "cc_modalidad")
	private String modalidad;

	@ManyToOne()
	@JoinColumn()
	private Campus campus;

	@ManyToOne()
	@JoinColumn()
	private Carrera carrera;

	@OneToMany(mappedBy = "cc", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Curso> curso;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getModalidad() {
		return modalidad;
	}

	public void setModalidad(String modalidad) {
		this.modalidad = modalidad;
	}

	public Campus getCampus() {
		return campus;
	}

	public void setCampus(Campus campus) {
		this.campus = campus;
	}

	public Carrera getCarrera() {
		return carrera;
	}

	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}

	public List<Curso> getCurso() {
		return curso;
	}

	public void setCurso(List<Curso> curso) {
		this.curso = curso;
	}

}
