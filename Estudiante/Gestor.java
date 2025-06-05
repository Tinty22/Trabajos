package AbranCancha;

import java.util.Scanner;

public class Gestor {

	public static void main(String[] args) {

		int opcion;
		Estudiante[] arreglo = new Estudiante[10];
		int cantidadRegistros = 0;
		do {

			Scanner lector = new Scanner(System.in);

			System.out.println("Bienvenido");
			System.out.println("Ingresa opcion deseada:");
			System.out.println("1- Ingresar Estudiante");
			System.out.println("2- Mostrar Lista de Estudiantes");
			System.out.println("3- Eliminar estudiante");
			System.out.println("4- cambiar nombre de estudiante");
			System.out.println("5- Salir");
			opcion = lector.nextInt();

			switch (opcion) {
			case 1:
				altaEstudiante(arreglo, cantidadRegistros);
				cantidadRegistros++;
				break;

			case 2:
				listarEstudiantes(arreglo);

				break;

			case 3:
				borrarEstudiante(arreglo);
				break;

			case 4:
				listarEstudiantes(arreglo);
				System.out.println("Ingrese la cedula de el estudiante que desea cambiar el nombre: ");
				cambiarNEestudiante(arreglo,lector);
				break;
				
			case 5:
				System.out.println("Se terminó");
				break;

			default:
				System.out.println("Opcion no disponible");
				break;
			}

		} while (opcion != 5);

	}

	public static void listarEstudiantes(Estudiante[] arreglo) {

		for (int i = 0; i < arreglo.length; i++) {
			if (arreglo[i] != null) {
				System.out.print("Estudiante N°" + i + " CI: " + arreglo[i].getCI());
				System.out.print(" NOMBRE: " + arreglo[i].getNombre());
				System.out.println(" APELLIDO: " + arreglo[i].getApellido());

			} else {
				System.out.println("Pos N°" + i + "es null");
			}

		}

	}

	public static void altaEstudiante(Estudiante[] arreglo, int cantidadRegistros) {
		Scanner lector = new Scanner(System.in);

		
				System.out.println("Ingresa CI: ");
				int ci = lector.nextInt();
				System.out.println("Ingresa Nombre: ");
				String nombre = lector.next();
				System.out.println("Ingresa Apellido: ");
				String apellido = lector.next();
				for (int i = 0; i < arreglo.length; i++) {
					if (arreglo[i] == null) {
				arreglo[cantidadRegistros] = new Estudiante(ci, nombre, apellido);
				break;
			}

		}

	}

	public static void borrarEstudiante(Estudiante[] arreglo) {
		Scanner lector = new Scanner(System.in);
		listarEstudiantes(arreglo);
		System.out.println("Seleccione la cedula de el estudiante que quiere eliminar: ");
		int Alumn = lector.nextInt();
		for (int i = 0; i < arreglo.length; i++) {
			if (arreglo[i] != null && arreglo[i].getCI() == Alumn) {
				arreglo[i] = null;
			}

		}

	}
	public static void cambiarNEestudiante(Estudiante[] arreglo, Scanner lector) {
		String Alumn = lector.next();
		for (int i = 0; i < arreglo.length; i++) {
			if (arreglo[i] != null && arreglo[i].getNombre() == Alumn) {
				System.out.println("ingrese el nuevo nombre: ");
				String nombre = lector.next();
				arreglo[i].setNombre(nombre);
			}

		}
	}

}
