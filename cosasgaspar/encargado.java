package interfacee;
import java.util.*;

public class encargado implements mail{
 String nombre;
int edad = 20;

	

	public encargado(String nombre, int edad) {
	super();
	this.nombre = nombre;
	this.edad = edad;
	
}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public void enviarmail() {
Scanner lector = new Scanner(System.in);
		
		System.out.println("enviar mail a:  ");
		System.out.println("1-Tecnico");
		System.out.println("2-Alternos");
		int ad = lector.nextInt();
		switch (ad) {
		case 1:
			
		System.out.println("Escriba el mail: ");
	    String a = lector.next();
			
				
			
			break;
	     case 2:
	    	 System.out.println("no tiene los permisos necesarios");
	    	 
	    	 
		  default:
			break;
	
		
	}}}
			





	



		
	

	


