package papapapam;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class floresamarillas extends JFrame {
	Persona[] pArr = new Persona[10];

	public floresamarillas() {

		JPanel panel1 = new JPanel();

		this.setTitle("Mi App con JTable");
		this.setSize(600, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

		JTextField txtfNombre = new JTextField();
		JTextField txtfApellido = new JTextField();
		JSpinner spCedula = new JSpinner(new SpinnerNumberModel(0, 0, 1000000000, 1));

		JLabel laNombre = new JLabel("Nombre ");
		JLabel laApellido = new JLabel("Apellido ");
		JLabel laCedula = new JLabel("Cedula");

		
		JButton PINGO = new JButton("Almacenar");
		JButton PORONGA = new JButton("Muestreo");

		DefaultTableModel modeloTabla = new DefaultTableModel();
		modeloTabla.addColumn("Nombre");
		modeloTabla.addColumn("Apellido");
		modeloTabla.addColumn("Cedula");

		JTable tabla = new JTable(modeloTabla);

		JScrollPane scroll = new JScrollPane(tabla);

		PINGO.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String aNombre = txtfNombre.getText();
				String aApellido = txtfApellido.getText();
				int aCedula = (int) spCedula.getValue();

				Jacobo(pArr, aNombre, aApellido, aCedula);

			}
		});

		PORONGA.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				Mostrar(pArr, modeloTabla);
				
			}

			
				
			

			
			

		});

		this.add(panel1);
		panel1.add(laNombre);
		panel1.add(txtfNombre);
		panel1.add(laApellido);
		panel1.add(txtfApellido);
		panel1.add(laCedula);
		panel1.add(spCedula);
		panel1.add(PINGO);
		panel1.add(PORONGA);

		txtfNombre.setColumns(5);
		txtfApellido.setColumns(10);

		panel1.add(scroll);

	}

	public static void Jacobo(Persona[] pArr, String aNombre, String aApellido, int aCedula) {
		for (int i = 0; i <= pArr.length; i++) {
			if (pArr[i] == null) {
				pArr[i] = new Persona(aNombre, aApellido, aCedula);
				System.out.println("Nombre: " + aNombre);
				System.out.println("Apellido: " + aApellido);
				System.out.println("Cedula: " + aCedula);

				break;
			}

		}
	}

	public static void Mostrar(Persona[] pArr, DefaultTableModel modelo) {
		for (int i = 0; i < pArr.length; i++) {
			
			if (pArr[i] != null) {
				
				Object[] data = { pArr[i].getNombre(), pArr[i].getApellido(), pArr[i].getCedula() };

				modelo.addRow(data);
				
			} else {
				continue;
			}

		}

	}
}
