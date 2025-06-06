package PrácticoElmundoacadémico;

import java.util.*;

public class Gestor {

	public static void main(String[] args) {
		Scanner l = new Scanner(System.in);

		System.out.println("Publicacion: --Libro--");
		System.out.println("Ingrese el id: ");
		int id = l.nextInt();
		System.out.println("Ingrese el titulo: ");
		String titulo = l.next();
		System.out.println("Ingrese el tipo de contenido: ");
		String contenido = l.next();
		System.out.println("Ingrese autor: ");
		String autor = l.next();
		System.out.println("Ingrese el numero de paginas del Libro " + titulo + ": ");
		int numPaginas = l.nextInt();
		System.out.println("Ingrese el año de publicación del Libro: ");
		int anoPublicacion = l.nextInt();
		System.out.println("Ingrese la editorial: ");
		String editorial = l.next();
		System.out.println("Ingrese el genero del Libro: ");
		String genero = l.next();
		
		Libro lib1 = new Libro(id,titulo,contenido,autor,numPaginas,anoPublicacion,editorial,genero);
			
		System.out.println("Publicacion: --Revista--");
		System.out.println("Ingrese el id: ");
		int id2 = l.nextInt();
		System.out.println("Ingrese el titulo: ");
		String titulo2 = l.next();
		System.out.println("Ingrese el tipo de contenido: ");
		String contenido2 = l.next();
		System.out.println("Ingrese autor: ");
		String autor2 = l.next();
		System.out.println("Numero de edicion:");
		int numero = l.nextInt();
		System.out.println("¿Con que frecuancia se publican revistas?: ");
		String frecuencia = l.next();
		System.out.println("Categoria de la Revista: ");
		String categoria = l.next();
		System.out.println("Ingrese la editorial de la Revista: ");
		String editorial2 = l.next();

		Revista rev1 = new Revista(id2,titulo2,contenido2,autor2,numero,frecuencia,categoria,editorial2);
		
		System.out.println("Publicacion: --ArticuloCientifico--");
		System.out.println("Ingrese el id: ");
		int id3 = l.nextInt();
		System.out.println("Ingrese el titulo: ");
		String titulo3 = l.next();
		System.out.println("Ingrese el tipo de contenido: ");
		String contenido3 = l.next();
		System.out.println("Ingrese autor: ");
		String autor3 = l.next();
		System.out.println("Ingrese la instutucion de el Articulo Cientifico: ");
		String institucion = l.next();
		System.out.println("Ingrese la fecha de revision de el articulo: ");
		String fechRevision= l.next();
		System.out.println("Ingrese la fecha de aceptacion de el articulo: ");
		String fechAceptacion = l.next();
		
		ArticuloCientifico ac1 = new ArticuloCientifico(id3,titulo3,contenido3,autor3,institucion,fechRevision,fechAceptacion);
		
		System.out.println("-- Libro --"+ "\n" + lib1);
		System.out.println(" ");
		System.out.println("-- Revista ---" + "\n" + rev1);
		System.out.println(" ");
		System.out.println("-- Articulo Cientifico --" + "\n" + ac1);
		
	}

}
