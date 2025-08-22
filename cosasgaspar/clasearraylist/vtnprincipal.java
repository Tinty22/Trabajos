package clasearraylist;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class vtnprincipal extends JFrame {

	public vtnprincipal() {
		Logica gestor = new Logica();
		this.setTitle("Mi App con JTable");
		this.setSize(700, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

		DefaultTableModel modelo = new DefaultTableModel();

		modelo.addColumn("ISBN");
		modelo.addColumn("NOMBRE");
		JPanel panelbotones = new JPanel();
		panelbotones.setLayout(new BoxLayout(panelbotones, BoxLayout.Y_AXIS));
		JTable a = new JTable(modelo);
		JScrollPane scroll = new JScrollPane(a);
		JButton btnAlta = new JButton("    Alta Libro    ");
		JButton btnEliminar = new JButton("Eliminar Libro");
		JButton btnActualizar = new JButton("   Actualizar    ");

		panelbotones.add(btnActualizar);
		panelbotones.add(btnAlta);
		panelbotones.add(btnEliminar);
		this.add(panelbotones, BorderLayout.WEST);
		this.add(scroll, BorderLayout.CENTER);

		btnAlta.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				gestor.mostrarAlta();
			

			}
		});
		btnActualizar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				gestor.limpiar(modelo);
				gestor.listar(modelo);
				
			}
		});
		
btnEliminar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				gestor.eliminar(a.getSelectedRow(), modelo);
				
			}
		});
		
			
			
			
		}
		
	


}
