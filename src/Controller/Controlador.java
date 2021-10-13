package Controller;

import javax.swing.JFrame;

import Model.Programa;
import View.Masificacion;
import View.Menu;
import View.MenuRellenar;

public class Controlador {

	private Masificacion mivista;
	private Menu miMenu;
	private MenuRellenar mimenuarellenar;
	private Programa miPrograma;

	public void setVista(Masificacion mivista) {
		this.mivista = mivista;
	}

	public void setMenu(Menu miMenu) {
		this.miMenu = miMenu;

	}

	public void cerrarventana(JFrame cerrar) {
		cerrar.setVisible(false);
	}

	public void irAVentana(JFrame cerrar, JFrame abrir) {
		cerrar.setVisible(false);
		abrir.setVisible(true);
	}

	public void abrirVentana(JFrame abrir) {
		abrir.setVisible(true);
	}

	public Masificacion getMivista() {
		return mivista;
	}

	public void setMivista(Masificacion mivista) {
		this.mivista = mivista;
	}

	public Menu getMiMenu() {
		return miMenu;
	}

	public void setMiMenu(Menu miMenu) {
		this.miMenu = miMenu;
	}

	public void setMenuRellenar(MenuRellenar mimenuarellenar) {
		this.mimenuarellenar = mimenuarellenar;
		
	}

	public void addProgram(String text) {
		miPrograma.setNombre(text);
	}
	
	

}
