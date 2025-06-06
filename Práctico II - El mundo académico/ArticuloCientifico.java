package PrácticoElmundoacadémico;

public class ArticuloCientifico extends Publicacion {

	String institucion,fechRevision,fechAceptacion;
	
	
	public ArticuloCientifico(int id, String titulo, String contenido, String autor,String institucion, String fechRevision, String fechAceptacion) {
		super(id, titulo, contenido, autor);
		this.institucion=institucion;
		this.fechRevision=fechRevision;
		this.fechAceptacion=fechAceptacion;
	}
	public String toString() {
	    return "Libro {" + "\n"+
	           "Id de el Libro: " + id +
	           "Titulo: " + titulo + "\n" +
	           "Contenido: " + contenido + "\n" +
	           "Autor: " + autor + "\n" +
	           "Institucion: " + institucion + "\n" +
	           "Fecha de revision del Articulo" + fechRevision + "\n" +
	           "Fecha de Aceptacion: " + fechAceptacion
	           ;
}
}