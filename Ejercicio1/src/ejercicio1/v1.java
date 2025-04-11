package ejercicio1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class v1 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblSegundoNumero;
	private JLabel lblTercerNumero;
	private JTextField TxtN1;
	private JTextField TxtN2;
	private JTextField TxtN3;
	private JButton btnSumaEnteros;
	private JButton btnSumaReales;
	private JScrollPane scrollPane;
	private JTextArea TxtS;
	private JButton btnSumaEnteros_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					v1 frame = new v1();
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
	public v1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 555, 431);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("Primer numero ");
			lblNewLabel.setBounds(38, 61, 89, 14);
			contentPane.add(lblNewLabel);
		}
		{
			lblSegundoNumero = new JLabel("Segundo numero");
			lblSegundoNumero.setBounds(38, 100, 89, 14);
			contentPane.add(lblSegundoNumero);
		}
		{
			lblTercerNumero = new JLabel("Tercer numero  (Opcional)");
			lblTercerNumero.setBounds(38, 141, 145, 14);
			contentPane.add(lblTercerNumero);
		}
		{
			TxtN1 = new JTextField();
			TxtN1.setBounds(190, 58, 86, 20);
			contentPane.add(TxtN1);
			TxtN1.setColumns(10);
		}
		{
			TxtN2 = new JTextField();
			TxtN2.setBounds(190, 97, 86, 20);
			contentPane.add(TxtN2);
			TxtN2.setColumns(10);
		}
		{
			TxtN3 = new JTextField();
			TxtN3.setBounds(190, 138, 86, 20);
			contentPane.add(TxtN3);
			TxtN3.setColumns(10);
		}
		{
			btnSumaEnteros = new JButton("Suma 3 enteros ");
			btnSumaEnteros.addActionListener(this);
			btnSumaEnteros.setBounds(312, 96, 178, 23);
			contentPane.add(btnSumaEnteros);
		}
		{
			btnSumaReales = new JButton("Suma 2 Reales ");
			btnSumaReales.addActionListener(this);
			btnSumaReales.setBounds(312, 137, 178, 23);
			contentPane.add(btnSumaReales);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(38, 187, 457, 172);
			contentPane.add(scrollPane);
			{
				TxtS = new JTextArea();
				TxtS.setText("Verificando");
				scrollPane.setViewportView(TxtS);
			}
		}
		{
			btnSumaEnteros_1 = new JButton("Suma 2 enteros ");
			btnSumaEnteros_1.addActionListener(this);
			btnSumaEnteros_1.setBounds(312, 57, 178, 23);
			contentPane.add(btnSumaEnteros_1);
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnSumaReales) {
			do_btnSumaReales_actionPerformed(e);
		}
		if (e.getSource() == btnSumaEnteros) {
			do_btnSumaEnteros_actionPerformed(e);
		}
		if (e.getSource() == btnSumaEnteros_1) {
			do_btnSumaEnteros_1_actionPerformed(e);
		}
	}
	protected void do_btnSumaEnteros_1_actionPerformed(ActionEvent e) {
		
		try {
			
		int n1 = Integer.parseInt(TxtN1.getText());
		int n2 = Integer.parseInt(TxtN2.getText());
		
		Calculadora c = new Calculadora(n1, n2);
		TxtS.append("La suma es:" +c.Sumar(n1,n2));
		
	} catch (Exception e2) {
		
		JOptionPane.showMessageDialog(this, "Ingrese Numero Enteros");
	}
		
	}
	protected void do_btnSumaEnteros_actionPerformed(ActionEvent e) {
		
		try {
			
			int n1 = Integer.parseInt(TxtN1.getText());
			int n2 = Integer.parseInt(TxtN2.getText());
			int n3 = Integer.parseInt(TxtN3.getText());
			
			Calculadora c = new Calculadora(n1, n2, n3);
			TxtS.append("La suma es:" +c.Sumar(n1,n2,n3));
			
		} catch (Exception e2) {
			
			JOptionPane.showMessageDialog(this, "Ingrese Numero Enteros");
		}
		
	}
	protected void do_btnSumaReales_actionPerformed(ActionEvent e) {
		
           try {
	
			double num1 = Double.parseDouble(TxtN1.getText());
			double num2 = Double.parseDouble(TxtN2.getText());
			
			Calculadora c = new Calculadora(num1, num2);
			TxtS.setText("");
			TxtS.append("La suma es:" +c.Sumar(num1, num2));
			
		} catch (Exception e2) {
			
			JOptionPane.showMessageDialog(this, "Ingrese Numeros Reales");
		}
	}
	
}
