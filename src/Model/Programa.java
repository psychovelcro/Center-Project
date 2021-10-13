package Model;

import java.util.List;

public class Programa {

	private String nombre;
	private List<String> listadoUnidades;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<String> getListadoUnidades() {
		return listadoUnidades;
	}

	public void setListadoUnidades(List<String> listadoUnidades) {
		this.listadoUnidades = listadoUnidades;
	}
	
	public void addUnit(String u) {
		listadoUnidades.add(u);
	}

}
