package Ejercicioventana;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;
public class Miventana extends JFrame {
public Miventana() {
	
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	JPanel panel4 = new JPanel();
	this.setTitle("Mi App con JTable");
    this.setSize(600, 400);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    
    this.setLayout(FlowLayout.LEFT);
    this.add(panel1, BorderLayout.WEST);
    JButton piero = new JButton ("piero");
    JButton gaspar = new JButton ("gaspar");
    JButton german = new JButton ("german");
    JButton nabuel = new JButton ("nabuel");
    panel1.setBackground(Color.green);
    this.add(panel2, BorderLayout.NORTH);
    panel2.setBackground(Color.PINK);
    this.add(panel3, BorderLayout.CENTER);
    panel3.setBackground(Color.yellow);
    
    
 
	
    String[] nombresColumnas = {"Nombre", "Edad", "Ciudad"}; //Encabezados de la tabla
    
    Object[][] datosTabla = { // Datos para la tabla
        {"Ana García", 17, "Montevideo"},
        {"Luis Pérez", 16, "Canelones"},
        {"Sofía Díaz", 18, "Punta del Este"},
        {"Carlos Ruiz", 16, "Salto"}
    };
    JTable miTabla = new JTable(datosTabla, nombresColumnas);
    JScrollPane panelDesplazable = new JScrollPane(miTabla);

   
    
    //panel1.add(panelDesplazable);
    panel2.add(piero);
    panel2.add(gaspar);
    panel2.add(german);
    panel1.add(nabuel);
    panel1.add(gaspar);
    this.add(miTabla);
   
    panel1.setLayout(new GridLayout(10,10));
    
    
    
}

private void setLayout(int left) {
	// TODO Auto-generated method stub
	
}  
}