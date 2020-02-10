package ec.edu.ups.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

import ec.edu.ups.bo.SedeON;
import ec.edu.ups.model.Campus;
import ec.edu.ups.model.Sede;

@ManagedBean(name = "sedeMB")
@ViewScoped
public class SedeController {

	private Sede sede = new Sede();
	private List<Sede> listaCategorias;

	private int id;

	@Inject
	private SedeON sdON;

	private int codCat;

	@PostConstruct
	public void init() {
		sede = new Sede();
		listaCategorias = sdON.getListadoCategorias();
	}

	public void loadData() {
		System.out.println("codigo editar " + id);
		if (id == 0)
			return;
		sede = sdON.getCategoria(id);
		System.out.println(sede.getCodigo() + " " + sede.getNombre());
		System.out.println("N° Campus: " + " " + sede.getCampus().size());
		for (Campus prod : sede.getCampus()) {
			System.out.println("\t" + prod);
		}
	}

	public Sede getCategoria() {
		return sede;
	}

	public void setCategoria(Sede categoria) {
		this.sede = categoria;
	}

	public List<Sede> getListaCategorias() {
		return listaCategorias;
	}

	public void setListaCategorias(List<Sede> listaCategorias) {
		this.listaCategorias = listaCategorias;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCodCat() {
		return codCat;
	}

	public void setCodCat(int codCat) {
		this.codCat = codCat;
	}

	public Sede getCategoria(int codigoCat) {

		if (codigoCat == 0) {
			throw new IllegalArgumentException("Codigo invalido");
		}
		for (Sede categoria : listaCategorias) {
			if (codigoCat == (categoria.getCodigo())) {
				return categoria;
			}

		}
		return null;
	}

	public String cargarDatos() {

		try {
			sdON.guardar(sede);
			init();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	public String editar(int codigo) {

		return "categoria?faces-redirect=true&id=" + codigo;
	}

	public String borrar(int codigo) {
		System.out.println("codigo borrar " + codigo);

		try {
			sdON.borrar(codigo);
			init();
		} catch (Exception e) {
			System.out.println("Error " + e.getMessage());
			e.printStackTrace();
		}

		return null;
	}

	public String nuevo() {
		sede = new Sede();
		return "categoria";
	}

	public String listado() {
		return "listaCategoria";
	}
}
