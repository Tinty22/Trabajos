package PrácticoElmundoacadémico;

public class Libro extends Publicacion {

	int numPaginas, anoPublicacion;
	String editorial, genero;

	public Libro(int id, String titulo, String contenido, String autor, int numPaginas, int anoPublicacion,
			String editorial, String genero) {
		super(id, titulo, contenido, autor);
		this.numPaginas = numPaginas;
		this.anoPublicacion = anoPublicacion;
		this.editorial = editorial;
		this.genero = genero;

	}
	public String toString() {
	    return "Libro {" + "\n"+
	           "Id de el Libro: " + id +
	           "Titulo: " + titulo + "\n" +
	           "Contenido: " + contenido + "\n" +
	           "Autor: " + autor + "\n" +
	           "Numero de Paginas: " + numPaginas +
	           "Año de Publicacion: " + anoPublicacion +
	           "Editorial: " + editorial + "\n" +
	           "Genero: " + genero
	           ;
	}
}
