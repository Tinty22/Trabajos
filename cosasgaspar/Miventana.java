package Ejercicioventana;
import java.awt.Color;
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
    this.setLayout(new GridLayout(2, 2));
    this.add(panel1);
    JButton piero = new JButton ("piero");
    panel1.setBackground(Color.yellow);
    this.add(panel2);
    panel2.setBackground(Color.PINK);
    this.add(panel3);
    panel3.setBackground(Color.blue);
    this.add(panel4);
    panel4.setBackground(Color.red);
    
 /*
	
    String[] nombresColumnas = {"Nombre", "Edad", "Ciudad"}; //Encabezados de la tabla
    
    Object[][] datosTabla = { // Datos para la tabla
        {"Ana García", 17, "Montevideo"},
        {"Luis Pérez", 16, "Canelones"},
        {"Sofía Díaz", 18, "Punta del Este"},
        {"Carlos Ruiz", 16, "Salto"}
    };
    JTable miTabla = new JTable(datosTabla, nombresColumnas);
    JScrollPane panelDesplazable = new JScrollPane(miTabla);
    
    */
    
    //panel1.add(panelDesplazable);
    panel2.add(piero);
   
   
    
    
    
}  
}