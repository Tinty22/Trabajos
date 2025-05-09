package FigurasGeométricas;

import java.util.Scanner;

public class Trangulo extends FigurasGeométricas {
	
	

	String tipo;
	int gradosAngulos, area, altura, perimetro;
	
	public Trangulo (String n, int cL, int cA, int m, String t, int gA, int ar, int al, int per) {
		super(n,cL,cA,m);
		this.tipo = t;
		this.altura = al;
		this.gradosAngulos = gA;
		this.area = ar;
		this.perimetro = per;
		
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

		System.out.print("Tipo de triangulo: ");
		String tipo = l.nextLine();
		
		System.out.print("Altura del triangulo; ");
		int altura = l.nextInt();
		
		System.out.print("Grado de angulos: ");
		int gradosAngulos = l.nextInt();
		
		System.out.print("Area: ");
		int area = l.nextInt();
		
		System.out.print("Perímetro del triangulo: ");
		int perimetro = l.nextInt();
		
		Trangulo tri1 = new Trangulo(nombre,cantLados,cantAngulos,medidaLados,tipo,gradosAngulos,area,altura,perimetro);
		System.out.println(" ");
		System.out.println("\n--- Triangulo ---");
		System.out.println(" ");
		System.out.println(tri1);
		
	}
	@Override
	public String toString() {
		
		return "Nombre: " + nombre + "\n" + "Cantidad de lados: " + cantLados + "\n" + "Cantidad de Angulos: " + cantAngulos + "\n" + "Medida de lados: " + medidaLados + "\n" + "Tipo de triangulo: " + tipo + "\n" + "Altura: " + altura + "\n" + "Grado de angulos: " + gradosAngulos + "\n" + "Area: " + area + "\n" + "Perimetro: " + perimetro;
	}

}
