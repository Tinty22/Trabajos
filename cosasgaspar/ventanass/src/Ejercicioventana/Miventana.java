package Ejercicioventana;
import javax.swing.*;
public class Miventana extends JFrame {
public Miventana() {
	
	
	this.setTitle("Titulo de mi entana"); 
	this.setSize(600,400); //tamaño en px,primero ancho y luego largo
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //accion default para cerrar
	this.setLocationRelativeTo(null); //posicion en la que inicia la ventana
	JPanel panel1 = new JPanel ();
	JLabel usuario1 = new JLabel ("Usuario: ");
	JTextField inp1 = new JTextField();
	JLabel contraseña = new JLabel ("Contraseña: ");
	JTextField inp2 = new JTextField();
	JButton inicia = new JButton("Inicia Sesion");
	
	this.add(panel1);
	panel1.add(usuario1);
	panel1.add(inp1);
	panel1.add(contraseña);
	panel1.add(inp2);
	panel1.add(inicia);
	inp1.setColumns(5);
	inp2.setColumns(10);
}  
}

