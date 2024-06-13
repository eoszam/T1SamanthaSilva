package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import examen.Cilindro;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Problema1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextArea txtInfo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Problema1 frame = new Problema1();
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
	public Problema1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(68, 101, 320, 133);
		contentPane.add(scrollPane);
		
		txtInfo = new JTextArea();
		scrollPane.setViewportView(txtInfo);
		
		JButton btnProcesar = new JButton("PROCESAR");
		btnProcesar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cilindro cilindro = new Cilindro(10,15);
				listadoCilindro(cilindro);
			}
		});
		btnProcesar.setBounds(184, 70, 85, 21);
		contentPane.add(btnProcesar);
	}
	public void listadoCilindro(Cilindro cilindro) {
		imprimir("El radio es: "+cilindro.getRadio());
		imprimir("La altura es: "+cilindro.getAltura());
		imprimir("El volumen es: "+cilindro.calcularVolumen());
		imprimir("El incremento del radio es: "+cilindro.getRadio()*1.17);
		imprimir("El incremento del radio es: "+cilindro.getAltura()*1.45);
	}
	
	public void imprimir (String text) {
		txtInfo.append(text+"\n");
	}
}
