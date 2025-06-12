package Supermercado;

import java.util.*;

public class Gestor {

	public static void main(String[] args) {
		Scanner l = new Scanner(System.in);
		int op;
		Electronica[] eArr = new Electronica[10];
		Ropa[] rArr = new Ropa[10];
		Alimento[] aArr = new Alimento[10];
		int cantidadRegistradaE = 0;
		int cantidadRegistradaR = 0;
		int cantidadRegistradaA = 0;
		do {

			System.out.println("Bienvenido");
			System.out.println("Ingresa opcion deseada:");
			System.out.println("1- Ingresar un dispositivo Electronico");
			System.out.println("2- Ingresar un tipo de Ropa");
			System.out.println("3- Ingresar un tipo de Alimento");
			System.out.println("4- Cambiar un tipo de producto");
			System.out.println("5- Mostrar lista de los productos");
			System.out.println("6- salir");
			op = l.nextInt();

			switch (op) {
			case 1:
				ingresarElectro(eArr,cantidadRegistradaE, l);
				break;

			case 2:

				break;

			case 3:

				break;

			case 4:

				break;

			case 5:
				HectorListadoEl(eArr);
				HectorListadoRo(rArr);
				HectorListadoAl(aArr);
				break;

			case 6:
				System.out.println("Se terminó");
				break;

			default:
				System.out.println("Opcion no disponible");
				break;
			}

		} while (op != 6);

	}

	public static void HectorListadoEl(Electronica[] eArr) {
		System.out.println("--- E L E C T R O N I C A  ---");
		for (int i = 0; i < eArr.length; i++) {
			if (eArr[i] != null) {
				System.out.println("Pos N°: " + i);
				System.out.print("Codigo: " + eArr[i].getCodigo());
				System.out.print(" Nombre: " + eArr[i].getNombre());
				System.out.println(" Precio: " + eArr[i].getPrecio());
				System.out.println(" Categoria: " + eArr[i].getCategoria());
				System.out.println(" Voltios: " + eArr[i].getVoltios());
			} else {
				System.out.println("Pos N°" + i + "esta vacia");
			}
		}
	}

	public static void HectorListadoRo(Ropa[] eArr) {
		System.out.println("--- R O P A ---");
		for (int i = 0; i < eArr.length; i++) {
			if (eArr[i] != null) {
				System.out.println("Pos N°: " + i);
				System.out.print("Codigo: " + eArr[i].getCodigo());
				System.out.print(" Nombre: " + eArr[i].getNombre());
				System.out.println(" Precio: " + eArr[i].getPrecio());
				System.out.println(" Material: " + eArr[i].getMaterial());
				System.out.println(" Color: " + eArr[i].getColor());
				System.out.println(" Talle: " + eArr[i].getTalle());
			} else {
				System.out.println("Pos N°" + i + "esta vacia");
			}
		}
	}

	public static void HectorListadoAl(Alimento[] aArr) {
		System.out.println("--- A L I M E N T O S ---");
		for (int i = 0; i < aArr.length; i++) {
			if (aArr[i] != null) {
				System.out.println("Pos N°: " + i);
				System.out.print("Codigo: " + aArr[i].getCodigo());
				System.out.print(" Nombre: " + aArr[i].getNombre());
				System.out.println(" Precio: " + aArr[i].getPrecio());
				System.out.println(" Fecha de vencimiento: " + aArr[i].getfVenc());
				System.out.println(" Proceso: " + aArr[i].getProceso());
				System.out.println(" Calorias: " + aArr[i].getCalorias());
			} else {
				System.out.println("Pos N°" + i + "esta vacia");
			}
		}
	}
	public static void ingresarElectro(Electronica[] eArr,int cantidadRegistrosE, Scanner l) {
		System.out.println("Ingresa Codigo: ");
		double codigo = l.nextDouble();
		System.out.println("Ingresa Nombre: ");
		String nombre = l.next();
		System.out.println("Ingresa Precio: ");
		double precio = l.nextDouble();
		System.out.println("Ingresa Categoria : ");
		String categoria = l.next();
		System.out.println("Ingresa voltios: ");
		double voltios = l.nextDouble();
		
		for (int i = 0; i < eArr.length; i++) {
			if (eArr[i] == null) {
		eArr[i] = new Electronica (codigo, nombre, precio,categoria,voltios);
		break;
	}

}

		
		
		
	}
} 
