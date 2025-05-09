package anasheks;

import java.util.*;

public class Auto extends Vehículo {

	String fechCompra, marca;
	int numPuertas, kilometros;

	public Auto(String m, int d, String se, String C, int P, int k, String M) {
		super(m, d, se);
		this.fechCompra = C;
		this.numPuertas = P;
		this.kilometros = k;
		this.marca = M;

	}

	public static void main(String[] args) {
		Scanner l = new Scanner(System.in);

		System.out.print("Matrícula del vehículo: ");
		String matricula = l.nextLine();

		System.out.print("Dueños del vehículo: ");
		int duenos = l.nextInt();

		System.out.print("Seguro del vehículo: ");
		String seguro = l.nextLine();

		System.out.print("Marca/modelo del Auto: ");
		String marca = l.nextLine();

		System.out.print("kilometros del Auto: ");
		int kilometros = l.nextInt();

		System.out.print("Número de puertas del Auto: ");
		int numPuertas = l.nextInt();

		System.out.print("Fecha de compra del Auto: ");
		String fechCompra = l.next();

		Auto auto1 = new Auto(matricula, duenos, seguro, fechCompra, numPuertas, kilometros, marca);
		System.out.println(" ");
		System.out.println("\n--- Detalles del Auto ---");
		System.out.println(" ");
		System.out.println(auto1);

	}
	
	@Override
	public String toString() {

		return "Nombre del dueño del vehículo: " + duenos + "\n" + "Matrícula: " + matricula + "\n" + "Seguro: " + seguro + "\n" + "Marca/modelo: " + marca + "\n" + "kilometros: " + kilometros + "K"+ "\n" + "Número de puertas:  " + numPuertas + "\n" + "Fecha de compra: " + fechCompra ;
		
	}

}

