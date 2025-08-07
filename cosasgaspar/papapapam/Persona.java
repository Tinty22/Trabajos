package papapapam;

public class Persona {

	 private String Nombre, Apellido;
	private int Cedula;
	
	public Persona (String Nombre, String Apellido, int Cedula) {
		this.setNombre(Nombre);
		this.setApellido(Apellido);
		this.setCedula(Cedula);
		
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public int getCedula() {
		return Cedula;
	}

	public void setCedula(int cedula) {
		Cedula = cedula;
	}
	
	
	
}