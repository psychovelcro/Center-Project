package Model;

import java.util.List;

public class Acciones extends Programa {

	private List<String> listaUnidades;

	public Acciones() {
		super.setNombre("Acciones");

	}

	public void rellenarLista() {
		listaUnidades.add("Comiendo");
		listaUnidades.add("Bebiendo");
		listaUnidades.add("Soplando");
		listaUnidades.add("Durmiendo");
		listaUnidades.add("Jugando");
		listaUnidades.add("Cocinando");
		listaUnidades.add("Pintando");
	}

}
