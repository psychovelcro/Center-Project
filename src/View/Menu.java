package View;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Rectangle;
import javax.swing.border.TitledBorder;

import Controller.Controlador;

import javax.swing.border.EtchedBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.UIManager;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

import java.awt.Font;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu extends JFrame {

	private JFrame frame;
	private JPanel contentPane;
	private JLabel lblFondo;
	private JLabel lblPrograma;
	private JComboBox cbxPrograma;
	private JLabel lblUnidadARealizar;
	private JComboBox cbxUnidad;
	private Controlador miControlador;
	private Masificacion miMas;

	public void setControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}

	public void setVista(Masificacion miMas) {
		this.miMas = miMas;
	}

	public Menu() {
		setTitle("GetDataApp");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1047, 637);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		cbxUnidad = new JComboBox();
		cbxUnidad.setFont(new Font("Berlin Sans FB", Font.PLAIN, 22));
		cbxUnidad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (cbxUnidad.getSelectedItem().toString() != "") {
					miControlador.abrirVentana(miControlador.getMivista());;
				}
				miMas.setlblUnidad(cbxUnidad.getSelectedItem().toString());

			}
		});

		cbxUnidad.setBounds(488, 245, 226, 38);
		contentPane.add(cbxUnidad);
		lblUnidadARealizar = new JLabel("Unidad a realizar");
		lblUnidadARealizar.setFont(new Font("Agency FB", Font.PLAIN, 27));
		lblUnidadARealizar.setBounds(488, 186, 556, 63);
		contentPane.add(lblUnidadARealizar);

		cbxPrograma = new JComboBox();
		cbxPrograma.setFont(new Font("Berlin Sans FB", Font.PLAIN, 22));
		rellenaCbxPrograma();
		cbxPrograma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rellenaCombo2((String) cbxPrograma.getSelectedItem());

			}
		});
		cbxPrograma.setBounds(189, 245, 226, 38);
		contentPane.add(cbxPrograma);

		lblPrograma = new JLabel("Programa a realizar");
		lblPrograma.setFont(new Font("Agency FB", Font.PLAIN, 27));
		lblPrograma.setBounds(189, 186, 226, 63);
		contentPane.add(lblPrograma);

		JLabel lblLogo = new JLabel("");
		lblLogo.setBounds(114, 0, 625, 158);
		contentPane.add(lblLogo);
		lblLogo.setIcon(new ImageIcon("IMG\\logolovaas.png"));

		lblFondo = new JLabel("");
		lblFondo.setForeground(Color.WHITE);
		lblFondo.setBounds(0, 0, 1031, 598);
		contentPane.add(lblFondo);
		lblFondo.setIcon(new ImageIcon("IMG\\fondolovaas.jpg"));

	}

	private void rellenaCbxPrograma() {
		cbxPrograma.addItem("Acciones");
		cbxPrograma.addItem("Categorias");
	}

	private void rellenaCombo2(String seleccionEnCombo1) {
		cbxUnidad.removeAllItems();
		if (seleccionEnCombo1.equals("Acciones")) {
			cbxUnidad.addItem("");
			cbxUnidad.addItem("Comiendo");
			cbxUnidad.addItem("Bebiendo");
			cbxUnidad.addItem("Soplando");
			cbxUnidad.addItem("Durmiendo");
			cbxUnidad.addItem("Jugando");
			cbxUnidad.addItem("Pintando");
			cbxUnidad.addItem("Cocinando");
		} else if (seleccionEnCombo1.equals("Categorias")) {
			cbxUnidad.addItem("");
			cbxUnidad.addItem("Colores");
			cbxUnidad.addItem("Animales");
			cbxUnidad.addItem("Frutas");
			cbxUnidad.addItem("Formas");
			cbxUnidad.addItem("Ropa");
			cbxUnidad.addItem("Amigos");
			cbxUnidad.addItem("Vehiculos");
		}

	}

	public String getCbxUnidad() {

		return cbxUnidad.getSelectedItem().toString();
	}

}
