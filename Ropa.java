package Nashe;

public class Ropa extends Producto{

	String material,color, talle;
	
	
	
	public Ropa(String codigo, String nombre,String garantia, String fechFab, double precio, String material, String color, String talle) {
		super(codigo, garantia, fechFab, nombre, precio);
		this.material=material;
		this.color=color;
		this.talle=talle;
		
		
	}
	@Override
	public String toString() {
		
		return "Nombre del producto: " + nombre + "\n"+ "Codigo: " + codigo  +"\n" + "Tiene garantia: " + garantia +"\n"+"Material: " + material + "\n"+"Color: "+ color + "\n"+"Talle: "+ talle+ "\n"+"Precio del producto: " + precio;
	}
}
