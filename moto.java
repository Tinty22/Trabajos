package anasheks;
import java.util.*;
public class moto extends Vehículo{

	
		String fechCompra, marca, cilindrado;
		int kilometros;
		

		
		public moto(String m, int d,String se, String C, int k, String c, String M) {
			super(m,d,se);
			this.fechCompra = C;
			this.kilometros = k;
			this.cilindrado = c;
			this.marca = M;
		}
		public static void main(String[] args) {
			Scanner l = new Scanner(System.in);
			
			System.out.print("Matrícula del vehículo: ");
			String matricula = l.nextLine();

			System.out.print("Dueños del vehículo: ");
			int duenos = l.nextInt();

			System.out.print("Seguro del vehículo: ");
			String seguro = l.nextLine();

			System.out.print("Fecha de compra de la moto: ");
			String fechCompra = l.nextLine();
			
			System.out.print("Kilometros de la moto: ");
			int kilometros = l.nextInt();
			
			System.out.print("Cindrado de la moto: ");
			String cilindrado = l.nextLine();
			
			System.out.print("Marca/modelo de la moto: ");
			String marca = l.next();
			
			moto moto1 = new moto(matricula, duenos, seguro,fechCompra,kilometros,cilindrado,marca);
			System.out.println(" ");
			System.out.println("\n--- Detalles de la moto ---");
			System.out.println(" ");
			System.out.println(moto1);
			
			
		}
		@Override
		public String toString() {

			return "Nombre del dueño del vehículo: " + duenos + "\n" + "Matrícula: " + matricula + "\n" + "Seguro: " + seguro + "\n" + "Marca/modelo: " + marca + "\n" + "kilometros: " + kilometros + "K"+ "\n" + "Fecha de compra: " + fechCompra ;
		}
	

}
