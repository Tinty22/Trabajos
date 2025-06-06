package PrácticoElmundoacadémico;

public class Revista extends Publicacion {

	int numero;
	String frecuencia, categoria, editorial;

	public Revista(int id, String titulo, String contenido, String autor, int numero, String frecuencia, String categoria,
			String editorial) {
		super(id, titulo, contenido, autor);
		this.numero = numero;
		this.frecuencia = frecuencia;
		this.categoria = categoria;
		this.editorial = editorial;

	}
	public String toString() {
	    return "Libro {" + "\n"+
	           "Id de el Libro: " + id +
	           "Titulo: " + titulo + "\n" +
	           "Contenido: " + contenido + "\n" +
	           "Autor: " + autor + "\n" +
	           "Numero: " + numero + "\n" +
	           "Frecuencia de publicacion: "+ frecuencia + "\n"+
	           "Categoria: " + categoria + "\n" +
	           "Editorial: " + editorial
	           ;
	}

}
