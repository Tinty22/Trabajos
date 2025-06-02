package Nashe;
import java.util.*;
public class Controlador {

	public static void main(String[] args) {
	Scanner l = new Scanner (System.in);
 
	
	    System.out.println("Producto de seccion:"+"\n"+" --Electronica--:");
		System.out.println("Ingrese el nombre del producto: ");
		String nombre = l.next();
		System.out.println("Ingrese el codigo del producto: ");
		String codigo = l.next();
		System.out.println("Ingrese si tiene garantia el producto: ");
		String garantia = l.next();
		System.out.println("Ingrese fecha de fabricacion del producto: ");
		String fechFab = l.next();
		System.out.println("Ingrese el precio del producto: ");
		double precio = l.nextDouble();
		System.out.println("Ingrese en cual categoria esta el producto: ");
		String categoria = l.next();
		System.out.println("Ingrese los voltios que nececita el producto: ");
		double voltios = l.nextDouble();
		
		Electronica elec1 = new Electronica(nombre,codigo,garantia,fechFab,precio,categoria,voltios);
			
		System.out.println("Producto de seccion:"+"\n"+" --Ropa--:");
		System.out.println("Ingrese el nombre del producto: ");
		String nombre2 = l.next();
		System.out.println("Ingrese el codigo del producto: ");
		String codigo2 = l.next();
		System.out.println("Ingrese si tiene garantia el producto: ");
		String garantia2 = l.next();
		System.out.println("Ingrese fecha de fabricacion del producto: ");
		String fechFab2 = l.next();
		System.out.println("Ingrese el precio del producto: ");
		double precio2 = l.nextDouble();
		System.out.println("Ingrese el material del producto: ");
		String material = l.next();
		System.out.println("Ingrese el color del producto: ");
		String color = l.next();
		System.out.println("Ingrese el talle del producto: ");
		String talle = l.next();
		
		Ropa ropa1 = new Ropa(nombre2,codigo2,garantia2,fechFab2,precio2,material,color,talle);
		
		System.out.println("Producto de seccion:"+"\n "+ " --Alimentos:--");
		System.out.println("Ingrese el nombre del producto: ");
		String nombre3 = l.next();
		System.out.println("Ingrese el codigo del producto: ");
		String codigo3 = l.next();
		System.out.println("Ingrese si tiene garantia el producto: ");
		String garantia3 = l.next();
		System.out.println("Ingrese fecha de fabricacion del producto: ");
		String fechFab3 = l.next();
		System.out.println("Ingrese el precio del producto: ");
		double precio3 = l.nextDouble();
		System.out.println("Ingrese la fecha de vencimiento producto: ");
		String fechaVencimiento = l.next();
		System.out.println("Ingrese el color del producto: ");
		String proceso = l.next();
		System.out.println("Ingrese el talle del producto: ");
		double calorias = l.nextDouble();
		
		Alimetos ali1 = new Alimetos(nombre3,codigo3,garantia3,fechFab3,precio3,fechaVencimiento,proceso,calorias);
			
		System.out.println("--Electronico--");
		System.out.println(elec1);
		System.out.println(" ");
		System.out.println("--Ropa--");
		System.out.println(ropa1);
		System.out.println(" ");
		System.out.println("--Alimento--");
		System.out.println(ali1);
		
	}
	

}
