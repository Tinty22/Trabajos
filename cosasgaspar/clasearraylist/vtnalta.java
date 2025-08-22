package clasearraylist;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class vtnalta extends JFrame{
public vtnalta() {
	JFrame aviso = new JFrame();
	Logica gestor = new Logica();
	this.setTitle("Mi App con JTable");
	this.setSize(300, 300);
	
	this.setLocationRelativeTo(null);
	
	this.setLayout(new FlowLayout());
	JLabel Jlbisbn = new JLabel ("ISBN");
	JLabel Jlbnom = new JLabel ("NOMBRE");
	JTextField jtISBN = new JTextField();
	JTextField jtnom = new JTextField();
	JButton alta = new JButton("Registrar");
	
	
	this.add(Jlbisbn);
	this.add(jtISBN);
	this.add(Jlbnom);
	this.add(jtnom);
	this.add(alta);
	jtISBN.setColumns(8);
	jtnom.setColumns(8);
	
	alta.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (gestor.guardarLibro(jtISBN.getText(), jtnom.getText() )) {
				JOptionPane.showMessageDialog(aviso,"guardado");
					
			}
		}
	});
	
}
}