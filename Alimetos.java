package Nashe;

public class Alimetos extends Producto{
	
	
	String fechVenc, proceso;
	double calorias;
	
	public Alimetos(String codigo, String nombre, String garantia, String fechFab, double precio, String fechVenc, String proceso, double calorias) {
		super(codigo, nombre, garantia, fechFab, precio);
		this.fechVenc=fechVenc;
		this.proceso=proceso;
		this.calorias=calorias;
		
		
	}
	@Override
	public String toString() {
		
		return "Nombre del producto: " + nombre + "\n"+ "Codigo: " + codigo  +"\n" + "Tiene garantia: " +garantia +"\n"+"Fecha de vencimiento: "+fechVenc+ "\n"+"Tiene procesos: "+ proceso+ "\n"+"Calorias: "+calorias+ "\n"+ "Precio del producto: " + precio;
	}

	
	
	
	
	}


