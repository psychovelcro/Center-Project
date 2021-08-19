package Controller;

import View.Masificacion;
import View.Menu;

public class main {

	public static void main(String[] args) {
		Controlador miControlador = new Controlador();
		Masificacion miMas = new Masificacion();
		Menu miMenu = new Menu();

		miControlador.setVista(miMas);
		miControlador.setMenu(miMenu);
//		miControlador.setModelo(miModelo);

//		miModelo.setVista(miVista);

//		miVista.setModelo(miModelo);
		miMas.setControlador(miControlador);
		miMenu.setControlador(miControlador);
		miMenu.setVista(miMas);
		miMas.setVista(miMenu);
		miMenu.setVisible(true);

	}

}
