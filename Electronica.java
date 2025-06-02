package Nashe;

public class Electronica extends Producto{

	String categoria;
	double voltios;
	
	
	public Electronica(String codigo, String nombre, String garantia, String fechFab, double precio, String categoria, double voltios) {
		super(codigo, garantia, fechFab, nombre, precio);
		this.categoria=categoria;
		this.voltios=voltios;
		
		
		
	}
	@Override
	public String toString() {
		
		return "Nombre del producto: " + nombre + "\n"+ "Codigo: " + codigo  +"\n" + "Tiene garantia: " + garantia +"\n"+ "Categoria producto: " + categoria+ "\n"+"Voltios: "+"Precio del producto: " + precio;
	}

}
