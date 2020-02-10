package ec.edu.ups.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.inject.Inject;



import ec.edu.ups.bo.CarreraON;
import ec.edu.ups.model.Carrera;
import ec.edu.ups.model.Materia;

@ManagedBean
public class CarreraController {
	
	@Inject
	private FacesContext facesContext;
	
	
	
	@Inject
	private CarreraON con;



	private Carrera newCarrera;
	
	private Materia newMateria;
	
	private List<Carrera> carreras;
	
	private List<Materia> materias;
	
	@PostConstruct
	public void init() {
		newCarrera=new Carrera();
		carreras=con.getListadoCarreras();
		materias=con.getListadoMaterias();
	}


	public CarreraON getCon() {
		return con;
	}


	public void setCon(CarreraON con) {
		this.con = con;
	}


	public Carrera getNewCarrera() {
		return newCarrera;
	}


	public void setNewCarrera(Carrera newCarrera) {
		this.newCarrera = newCarrera;
	}


		
	public Materia getNewMateria() {
		return newMateria;
	}


	public void setNewMateria(Materia newMateria) {
		this.newMateria = newMateria;
	}


	public List<Carrera> getCarreras() {
		return carreras;
	}


	public void setCarreras(List<Carrera> carreras) {
		this.carreras = carreras;
	}


	public List<Materia> getMaterias() {
		return materias;
	}


	public void setMaterias(List<Materia> materias) {
		this.materias = materias;
	}

	
	
	
	
	
}
