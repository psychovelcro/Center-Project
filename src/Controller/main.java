package Controller;

import View.Masificacion;
import View.Menu;
import View.MenuRellenar;

public class main {

	public static void main(String[] args) {
		Controlador miControlador = new Controlador();
		Masificacion miMas = new Masificacion();
		Menu miMenu = new Menu();
		MenuRellenar mimenuarellenar = new MenuRellenar();

		miControlador.setVista(miMas);
		miControlador.setMenu(miMenu);
		miControlador.setMenuRellenar(mimenuarellenar);
//		miControlador.setModelo(miModelo);

//		miModelo.setVista(miVista);

//		miVista.setModelo(miModelo);
		miMas.setControlador(miControlador);
		miMenu.setControlador(miControlador);
		mimenuarellenar.setControlador(miControlador);
		miMenu.setVista(miMas);
		miMas.setVista(miMenu);
		miMenu.setVisible(false);
		mimenuarellenar.setVisible(true);
		

	}

}
