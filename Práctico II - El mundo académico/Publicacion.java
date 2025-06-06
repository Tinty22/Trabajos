package PrácticoElmundoacadémico;

public abstract class Publicacion {

	int id;
	String titulo, contenido, autor;

	public Publicacion(int id, String titulo, String contenido, String autor) {
		this.id = id;
		this.titulo = titulo;
		this.contenido = contenido;
		this.autor = autor;
	}

}
