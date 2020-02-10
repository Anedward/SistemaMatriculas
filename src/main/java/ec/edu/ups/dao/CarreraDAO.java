package ec.edu.ups.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import ec.edu.ups.model.Carrera;
import ec.edu.ups.model.Materia;
import ec.edu.ups.model.Sede;


@Stateless
public class CarreraDAO {

	@Inject
	private EntityManager em;
	
	
	public List<Carrera> getCarreras() {
		String jpql = "SELECT c FROM Carrera c ";
		Query q = em.createQuery(jpql, Carrera.class);
		List<Carrera> lstSedes = q.getResultList();
		for (Carrera c : lstSedes) {
			c.getNombre();
			System.out.println("NOMBRE CARRERA"+c.getNombre());
		}
		return lstSedes;
	}
	
	public List<Materia> getMaterias() {
		String jpql = "SELECT m FROM Materia m ";
		Query q = em.createQuery(jpql, Materia.class);
		List<Materia> lstSedes = q.getResultList();
		//for (Materia m : lstSedes) {
			//m.getNombre();
			//System.out.println("NOMBRE CARRERA"+m.getNombre());
		//}
		return lstSedes;
	}
	
	
	
}
