package FigurasGeométricas;
import java.util.*;
public class Cuadrado extends FigurasGeométricas {

	//porofe, lo hice con cuandrado pq había leido mal
	int gradosAngulos, area, perimetro;

	
	public Cuadrado(String n, int cL, int cA, int m, int ar, int per, int gA) {
		super(n,cL,cA,m);
		this.area = ar;
		this.perimetro = per;
		this.gradosAngulos = gA;
		
	}
	public static void main(String[] args) {
		Scanner l = new Scanner(System.in);
		
		System.out.print("Nombre: ");
		String nombre = l.nextLine();

		System.out.print("Cantidad de lados: ");
		int cantLados = l.nextInt();

		System.out.print("Cantidad de ángulos: ");
		int cantAngulos = l.nextInt();

		System.out.print("Medida de lados: ");
		int medidaLados = l.nextInt();

		System.out.print("Area del cuadrado: ");
		int area = l.nextInt();
		
		System.out.print("Perímetro del cuadrado: ");
		int perimetro = l.nextInt();
		
		System.out.print("Grado de los ángulos: ");
		int gradosAngulos = l.nextInt();
		
		Cuadrado cu1 = new Cuadrado(nombre,cantLados,cantAngulos,medidaLados,area,perimetro, gradosAngulos);
		System.out.println(" ");
		System.out.println("\n--- Cuadrado ---");
		System.out.println(" ");
		System.out.println(cu1);
		
		
	}
	@Override
	public String toString() {
		
		return "Nombre: " + nombre + "\n" + "Cantidad de lados: " + cantLados + "\n" + "Cantidad de Angulos: " + cantAngulos + "\n" + "Medida de lados: " + medidaLados + "\n" + "Area: " + area + "\n" + "Perimetro: " + perimetro + "\n" + "Grado de los anduglos: " + gradosAngulos;
	}
}

