package clasearraylist;

public class Libro {
String nombre;
String ISBN;




public Libro(String nombre, String iSBN) {
	super();
	this.nombre = nombre;
	this.ISBN  = iSBN;
	
	
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getISBN() {
	return ISBN;
}
public void setISBN(String iSBN) {
	ISBN = iSBN;
	
	
}
@Override
	public String toString() {
		
		return  this.getNombre() + " " + this.getISBN();
		
	}
}