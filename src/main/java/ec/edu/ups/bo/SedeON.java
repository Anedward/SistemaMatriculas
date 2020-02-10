package ec.edu.ups.bo;

import java.util.List;

import javax.inject.Inject;

import ec.edu.ups.dao.SedeDAO;
import ec.edu.ups.model.Sede;


public class SedeON {

	@Inject
	private SedeDAO sddao;
	
	public void guardar(Sede cat){		
		sddao.save(cat);		
	}
	
	public List<Sede> getListadoCategorias(){
		return sddao.getSedes();
	}
	
	public void borrar(int codigo) throws Exception {
		try {
			sddao.delete(codigo);
		}catch(Exception e) {
			throw new Exception("Error al borrar " + e.getMessage());
		}	
	}
	
	public Sede getCategoria(int codigo) {
		Sede aux = sddao.read(codigo);
		return aux;	
	}
}
