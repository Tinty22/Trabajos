package Personas;
import java.util.*;
public class Estudiante extends Personas {

	
	String curso, orientacion, materias, horarios;
	int nroSalon;
	
	public Estudiante (String nc, int CI, String fN, String c, String o, String m, int nS, String h) {
		super(nc,CI,fN);
		this.curso = c;
		this.orientacion = o;
		this.materias = m;
		this.nroSalon = nS;
		this.horarios = h;
	}
	public static void main(String[] args) {
		Scanner l = new Scanner(System.in);
		
		System.out.print("Nombre completo: ");
		String nombreCompleto = l.nextLine();

		System.out.print("Numero de cedula de identidad: ");
		int CI = l.nextInt();

		System.out.print("Fecha de nacimiento: ");
		String fechNacimiento = l.nextLine();

		System.out.print("Cursos en los que está anotado: ");
		String curso = l.nextLine();

		System.out.print("Orientacion: ");
		String orientacion = l.nextLine();

		System.out.print("Materias que tiene: ");
		String materias = l.nextLine();

		System.out.print("Numero de salon: ");
		int nroSalon = l.nextInt();
	
		System.out.print("Horarios: ");
		String horarios = l.nextLine();
	
	Estudiante es1 = new Estudiante(nombreCompleto,CI ,fechNacimiento,curso,orientacion,materias,nroSalon,horarios);
	System.out.println(" ");
	System.out.println("\n--- Datos de Estudiante ---");
	System.out.println(" ");
	System.out.println(es1);
	
	}
	@Override
	public String toString() {
		
		return "Nombre completo: "+nombreCompleto+"\n" + "C.I: "+CI+"\n"+ "Fecha de Nacimiento: "+fechNacimiento+"\n" + "Curso: "+curso+"\n" + "Orientacion: "+orientacion+"\n" + "Materias: "+materias+"\n" + "Numero de salón: "+nroSalon+"\n" + "Horarios: "+ horarios;
	}
}

