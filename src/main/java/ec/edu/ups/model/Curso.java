package ec.edu.ups.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Curso {

	@Id
	@Column(name = "cur_codigo")
	private int codigo;
	
	@Column(name = "cur_numVeces")
	private int numeroVeces;
	
	@Column(name = "cur_tipoAprobacion")
	private String tipoAprobacion;

	@Column(name = "cur_estado")
	private String estadoMateria;
	
	@Column(name = "cur_notaFinal")
	private int notaFinal;
	
	@Column(name = "cur_periodo")
	private String periodo;
	
	@Column(name = "cur_grupo")
	private String grupo;
	
	@ManyToOne()
	@JoinColumn()
	private Materia materia;
	
	@ManyToOne()
	@JoinColumn()
	private Alumno alumno;
	
	@ManyToOne()
	@JoinColumn()
	private CampusCarrera cc;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getNumeroVeces() {
		return numeroVeces;
	}

	public void setNumeroVeces(int numeroVeces) {
		this.numeroVeces = numeroVeces;
	}

	public String getTipoAprobacion() {
		return tipoAprobacion;
	}

	public void setTipoAprobacion(String tipoAprobacion) {
		this.tipoAprobacion = tipoAprobacion;
	}

	public String getEstadoMateria() {
		return estadoMateria;
	}

	public void setEstadoMateria(String estadoMateria) {
		this.estadoMateria = estadoMateria;
	}

	public int getNotaFinal() {
		return notaFinal;
	}

	public void setNotaFinal(int notaFinal) {
		this.notaFinal = notaFinal;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public CampusCarrera getCc() {
		return cc;
	}

	public void setCc(CampusCarrera cc) {
		this.cc = cc;
	}
	
	
}
