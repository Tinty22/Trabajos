package interfacee;
import java.util.*;
public class gestor {

	public static void main(String[] args) {
		encargado en1 = new encargado(null, 0);
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Bienvenido al gestion");
		System.out.println("Ingresa que eres");
		System.out.println("1- Encargado");
		System.out.println("2- Alterno");
		System.out.println("2- Tecnico");
		int opc = lector.nextInt();
		switch (opc) {
		case 1:
			en1.setEdad(10);
			en1.setNombre("gaspar");
		System.out.println("Hola Gaspar: " + en1.getNombre());
			
			en1.enviarmail();
			break;
		case 2: 
		
		}
	
	}}
	
	
		

