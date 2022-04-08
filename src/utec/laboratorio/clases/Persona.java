package utec.laboratorio.clases;

public class Persona {

	private String nombre;
	private String apellido;
	private String cedula;
	
	Persona() {
		this.nombre = "";
		this.apellido = "";
		this.cedula = "";
	}
	
	Persona(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = "";
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getCedula() {
		return cedula;
	}
	
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	
	@Override
	public String toString() {
		return "Me llamo " + this.nombre + " " + this.apellido + " y mi cedula es " + this.cedula;
	}
	
}
