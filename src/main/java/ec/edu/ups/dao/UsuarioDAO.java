package ec.edu.ups.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import ec.edu.ups.model.Usuario;


@Stateless
public class UsuarioDAO {

	@Inject
	private EntityManager em;
	

	public String Login(String correo, String clave) {
		String result = "false";
		String jpql = "SELECT u FROM Usuario u WHERE u.correo = ?1 AND u.password = ?2 ";
		Query query1 = em.createQuery(jpql, Usuario.class);
		query1.setParameter(1, correo);
		query1.setParameter(2, clave);
		List<Usuario> listaL = query1.getResultList();

		System.out.println("lista " + listaL.size());
		if (listaL.size() == 0)
			return result;

		else
			return result = "true";

	}
}
