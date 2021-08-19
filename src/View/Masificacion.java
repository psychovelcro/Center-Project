package View;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.Controlador;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTabbedPane;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import java.awt.Panel;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.BevelBorder;

public class Masificacion extends JFrame {

	private JFrame frame;
	private Controlador miControlador;
	private JPanel contentPane;
	private JLabel Ensayo;
	private JLabel Porcentaje;
	private float correcto;
	private float acumulado;
	private int counter = 0;
	private JLabel lblUnidad;
	private Menu miMenu;
	private float incorrecto, moldeamiento, ayuda;

	public void setControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}

	public void setVista(Menu miMenu) {
		this.miMenu = miMenu;
	}

	public Masificacion() {
		setTitle("GetDataApp Lovaas");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1047, 637);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnVolverMenu = new JButton("Menu");
		btnVolverMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				miControlador.irAVentana(miControlador.getMivista(), miControlador.getMiMenu());

			}
		});
		btnVolverMenu.setFont(new Font("Berlin Sans FB", Font.PLAIN, 30));
		btnVolverMenu.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnVolverMenu.setBackground(new Color(204, 255, 153));
		btnVolverMenu.setBounds(60, 61, 168, 39);
		contentPane.add(btnVolverMenu);

		JLabel lblituloUnidad = new JLabel("Unidad Actual");
		lblituloUnidad.setForeground(new Color(255, 255, 255));
		lblituloUnidad.setFont(new Font("Berlin Sans FB", Font.PLAIN, 30));
		lblituloUnidad.setBounds(55, 183, 234, 49);
		contentPane.add(lblituloUnidad);

		lblUnidad = new JLabel("Unidad");
		lblUnidad.setFont(new Font("Berlin Sans FB", Font.PLAIN, 33));
		lblUnidad.setBounds(87, 222, 234, 49);
		contentPane.add(lblUnidad);

		JLabel lblpc = new JLabel("PC");
		lblpc.setFont(new Font("Agency FB", Font.PLAIN, 33));
		lblpc.setBounds(721, 420, 62, 75);
		contentPane.add(lblpc);

		JLabel lblMaificacion = new JLabel("Masificaci\u00F3n");
		lblMaificacion.setFont(new Font("Agency FB", Font.PLAIN, 42));
		lblMaificacion.setBounds(444, 213, 219, 57);
		contentPane.add(lblMaificacion);

		JButton btnNewButton = new JButton("Correcto");
		btnNewButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton.setFont(new Font("Berlin Sans FB", Font.PLAIN, 24));
		btnNewButton.setBackground(new Color(153, 204, 102));
		btnNewButton.setBounds(220, 297, 157, 121);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				correcto++;
				acumulado = correcto / Integer.valueOf(Ensayo.getText()) * 100;
				int value = (int) acumulado;
				Porcentaje.setText(String.valueOf(value) + "%");
				int num = Integer.valueOf(Ensayo.getText()) + 1;
				Ensayo.setText(String.valueOf(num));
				counter++;
				if (counter == 3) {
					JOptionPane.showMessageDialog(contentPane,
							"Ha conseguido 3 respuestas correctas seguidas, pase a la siguiente fase del aprendizaje");
					double ensayo = Integer.valueOf(Ensayo.getText());
					int incorrect = (int) (incorrecto / (ensayo - 1) * 100);
					int moldeamient = (int) (moldeamiento / (ensayo - 1) * 100);
					int ayud = (int) (ayuda / (ensayo - 1) * 100);

					// metodo para guardar resultados

				}

			}
		});

		JButton btnNewButton_2 = new JButton("Moldeamiento");
		btnNewButton_2.setFont(new Font("Berlin Sans FB", Font.PLAIN, 24));
		btnNewButton_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton_2.setBackground(new Color(153, 204, 102));
		btnNewButton_2.setBounds(554, 297, 157, 121);
		contentPane.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				moldeamiento++;
				acumulado = correcto / Integer.valueOf(Ensayo.getText()) * 100;
				int value = (int) acumulado;
				Porcentaje.setText(String.valueOf(value) + "%");
				int num = Integer.valueOf(Ensayo.getText()) + 1;
				Ensayo.setText(String.valueOf(num));
				counter = 0;
			}
		});

		Ensayo = new JLabel("1");
		Ensayo.setBounds(135, 313, 112, 75);
		contentPane.add(Ensayo);
		Ensayo.setFont(new Font("Segoe UI Black", Font.PLAIN, 39));

		JButton btnNewButton_2_1 = new JButton("Ayuda");
		btnNewButton_2_1.setFont(new Font("Berlin Sans FB", Font.PLAIN, 24));
		btnNewButton_2_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton_2_1.setBackground(new Color(153, 204, 102));
		btnNewButton_2_1.setBounds(721, 297, 157, 121);
		contentPane.add(btnNewButton_2_1);
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				ayuda++;
				acumulado = correcto / Integer.valueOf(Ensayo.getText()) * 100;
				int value = (int) acumulado;
				Porcentaje.setText(String.valueOf(value) + "%");
				int num = Integer.valueOf(Ensayo.getText()) + 1;
				Ensayo.setText(String.valueOf(num));
				counter = 0;
			}
		});

		Porcentaje = new JLabel("0");
		Porcentaje.setFont(new Font("Tahoma", Font.PLAIN, 40));
		Porcentaje.setBounds(760, 441, 118, 32);
		contentPane.add(Porcentaje);

		JButton btnIncorrecto = new JButton("Incorrecto");
		btnIncorrecto.setFont(new Font("Berlin Sans FB", Font.PLAIN, 24));
		btnIncorrecto.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnIncorrecto.setBackground(new Color(153, 204, 102));
		btnIncorrecto.setBounds(387, 297, 157, 121);
		contentPane.add(btnIncorrecto);
		btnIncorrecto.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {

				incorrecto++;
				acumulado = correcto / Integer.valueOf(Ensayo.getText()) * 100;
				int value = (int) acumulado;
				Porcentaje.setText(String.valueOf(value) + "%");
				int num = Integer.valueOf(Ensayo.getText()) + 1;
				Ensayo.setText(String.valueOf(num));
				counter = 0;

			}
		});

		JButton btnNewButton_1 = new JButton("Anterior");
		btnNewButton_1.setBackground(new Color(204, 255, 153));
		btnNewButton_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton_1.setBounds(455, 429, 89, 23);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (Integer.valueOf(Ensayo.getText()) > 1) {
					int num = Integer.valueOf(Ensayo.getText()) - 1;
					Ensayo.setText(String.valueOf(num));
				}

			}
		});

		JButton btnNewButton_1_1 = new JButton("Siguiente");
		btnNewButton_1_1.setBackground(new Color(204, 255, 153));
		btnNewButton_1_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton_1_1.setBounds(554, 429, 89, 23);
		contentPane.add(btnNewButton_1_1);
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				int num = Integer.valueOf(Ensayo.getText()) + 1;
				Ensayo.setText(String.valueOf(num));
			}
		});

		JLabel lblNewLabel = new JLabel("Ensayo");
		lblNewLabel.setFont(new Font("Agency FB", Font.PLAIN, 27));
		lblNewLabel.setBounds(113, 271, 75, 57);
		contentPane.add(lblNewLabel);

		JLabel lblLogoLovaas = new JLabel("");
		lblLogoLovaas.setBounds(380, 36, 621, 128);
		contentPane.add(lblLogoLovaas);
		lblLogoLovaas.setIcon(new ImageIcon("IMG\\logolovaas.png"));

		JLabel lblFondo = new JLabel("");
		lblFondo.setBounds(0, 0, 1031, 598);
		contentPane.add(lblFondo);
		lblFondo.setIcon(new ImageIcon("IMG\\fondolovaas.jpg"));

	}

	public void setlblUnidad(String unidad) {
		lblUnidad.setText(unidad);
	}
}
