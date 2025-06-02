package Nashe;

public abstract class Producto {

	String codigo,nombre, garantia, fechFab;
	double precio;
	
	
	
	public Producto(String codigo,String nombre, String garantia, String fechFab, double precio) {
		this.codigo=codigo;
		this.nombre=nombre;
		this.garantia=garantia;
		this.fechFab=fechFab;
		this.precio=precio;
		
	}



}
