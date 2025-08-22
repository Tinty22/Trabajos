package clasearraylist;

import java.util.ArrayList;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Logica {

	public static void main(String[] args) {
		

	vtnprincipal ventana1 = new vtnprincipal();
	ventana1.setVisible (true);
	
	}
	
	public void mostrarAlta () {
		vtnalta ventana2 = new vtnalta();
		ventana2.setVisible(true);
	}
	static ArrayList <Libro> arreglo = new ArrayList<>();	

	public boolean guardarLibro (String isbn, String nombre) {
		
		
		boolean resultado = false;
		
		if(arreglo.add(new Libro (isbn, nombre))) {
		resultado = true;
		System.out.println(arreglo.get(0));
		
		
		}
		return resultado;
		
		
		
	}

	public void listar(DefaultTableModel modelo) {
		for(int i = 0; i < arreglo.size(); i++) {
			Object[] datos = {arreglo.get(i).getISBN(), arreglo.get(i).getNombre()};
		modelo.addRow(datos);
		}
	}
	public void limpiar (DefaultTableModel modelo) {
		while(modelo.getRowCount() > 0 ) {
			modelo.removeRow(0);
			
		}
		}
	public void eliminar (int sececionado, DefaultTableModel modelo) {
		arreglo.remove(sececionado);
		modelo.removeRow(sececionado);
		
	}
}