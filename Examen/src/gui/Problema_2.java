package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import examen.Medico;

import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Problema_2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextArea txtArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Problema_2 frame = new Problema_2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Problema_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtArea = new JTextArea();
		txtArea.setBounds(32, 95, 369, 158);
		contentPane.add(txtArea);
		
		JButton btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Medico medico= new Medico(5,20.0,8);
				listadoMedico (medico);
				listadoGeneral (medico);
			}
		});
		btnProcesar.setBounds(169, 36, 85, 21);
		contentPane.add(btnProcesar);
	}
	public void imprimir (String text) {
		txtArea.append(text+"\n");
	}
	public void listadoMedico(Medico medico){
		imprimir("El codigo es:"+medico.getCodigo());
		imprimir("La tarifa es:"+medico.getTarifaxconsulta());
		imprimir("El numero de consulta es:"+medico.getNumeroConsultas());
    }
	public void listadoGeneral(Medico medico){
		imprimir("El ingreso neto es:"+medico.ingresoNeto());
	}
}
