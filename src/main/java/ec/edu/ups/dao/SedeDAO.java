package ec.edu.ups.dao;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import ec.edu.ups.model.Sede;

public class SedeDAO {

	@Inject
	private EntityManager em;

	public void save(Sede sd) {
		if (this.read(sd.getCodigo()) != null)
			this.update(sd);
		else
			this.create(sd);
	}

	public void create(Sede sd) {
		em.persist(sd);
	}

	public void update(Sede sd) {
		em.merge(sd);
	}

	public void delete(int id) {
		Sede sd = read(id);
		em.remove(sd);
	}

	public Sede read(int id) {
		return em.find(Sede.class, id);
	}

	public List<Sede> getSedes() {
		String jpql = "SELECT sd FROM Sede sd ";
		Query q = em.createQuery(jpql, Sede.class);
		List<Sede> lstSedes = q.getResultList();
		for (Sede sd : lstSedes) {
			sd.getCampus().size();
		}
		return lstSedes;
	}

}
