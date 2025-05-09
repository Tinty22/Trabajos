package Personas;
import java.util.*;
public class Profesor extends Personas {

	String cursos, materias, grados, horarios;
	int alumnos;

	public Profesor(String nc, int CI, String fN, String c, String m, String g, String h, int a) {
		super(nc, CI, fN);
		this.cursos = c;
		this.materias = m;
		this.grados = g;
		this.horarios = h;
		this.alumnos = a;
		
	}
	public static void main(String[] args) {
		Scanner l = new Scanner(System.in);
		
		System.out.print("Nombre completo: ");
		String nombreCompleto = l.nextLine();

		System.out.print("Numero de cedula de identidad: ");
		int CI = l.nextInt();

		System.out.print("Fecha de nacimiento: ");
		String fechNacimiento = l.nextLine();
		
		System.out.print("Cursos en los que da clases: ");
		String cursos = l.nextLine();
		
		System.out.print("Materias que da: ");
		String materias = l.nextLine();
		
		System.out.print("Grados en los que da clases: ");
		String grados = l.nextLine();
		
		System.out.print("Horarios: ");
		String horarios = l.nextLine();
		
		System.out.print("Cantidad de alumnos que tiene: ");
		int alumnos = l.nextInt();
		
		
		Profesor pro1 = new Profesor(nombreCompleto,CI,fechNacimiento,cursos,materias,grados,horarios,alumnos);
		System.out.println(" ");
		System.out.println("\n--- Datos de Profesor ---");
		System.out.println(" ");
		System.out.println(pro1);
}
	@Override
	public String toString() {
		
		
		return "Nombre completo: "+nombreCompleto+"\n" + "C.I: "+CI+"\n"+ "Fecha de Nacimiento: "+fechNacimiento+"\n" + "Cursos: "+cursos+"\n" + "Materias que da: "+materias+"\n"+"Grados: "+grados+"\n"+ "Horarios que tiene: "+horarios+"\n"+"Cantidad de alumnos: "+alumnos ;
	}
}