package ec.edu.ups.bo;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.dao.CarreraDAO;
import ec.edu.ups.model.Carrera;
import ec.edu.ups.model.Materia;
import ec.edu.ups.model.Sede;

@Stateless
public class CarreraON {
	
	@Inject
	private CarreraDAO cdao;
	
	
	public List<Carrera> getListadoCarreras(){
		return cdao.getCarreras();
	}
	
	public List<Materia> getListadoMaterias(){
		return cdao.getMaterias();
	}

}
