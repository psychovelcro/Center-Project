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
import Model.Programa;

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
import javax.swing.JTextField;
import javax.swing.JButton;

public class MenuRellenar extends JFrame {

	private JFrame frame;
	private JPanel contentPane;
	private JLabel lblFondo;
	private Controlador miControlador;
	private Masificacion miMas;
	private JTextField ProgramaTxt;
	private JLabel lblPrograma;
	private JButton btnAddProgram;

	public void setControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}

	public void setVista(Masificacion miMas) {
		this.miMas = miMas;
	}

	public MenuRellenar() {
		setTitle("GetDataApp");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1047, 637);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		btnAddProgram = new JButton("Add");
		btnAddProgram.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String Name = ProgramaTxt.getText();
				System.out.println(Name);
				
			}
		});
		btnAddProgram.setBounds(392, 258, 51, 23);
		contentPane.add(btnAddProgram);

		ProgramaTxt = new JTextField();
		ProgramaTxt.setBounds(165, 246, 217, 46);
		contentPane.add(ProgramaTxt);
		ProgramaTxt.setColumns(10);

		lblPrograma = new JLabel("Programa");
		lblPrograma.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPrograma.setBounds(76, 260, 80, 14);
		contentPane.add(lblPrograma);
		rellenaCbxPrograma();

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
	}
}
