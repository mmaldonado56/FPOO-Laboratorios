package utec.laboratorio.clases;

public class Mascota {

	private String nombre;
	private String especie;
	private float peso;
	private Persona propietario;
	
	Mascota() {
		this.nombre = "";
		this.especie = "";
		this.peso = 0;
		this.propietario = null;
	}
	
	Mascota(String nombre, Persona propietario) {
		this.nombre = nombre;
		this.especie = "";
		this.peso = 0;
		this.propietario = propietario;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getEspecie() {
		return especie;
	}
	
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	public float getPeso() {
		return peso;
	}
	
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	public Persona getPropietario() {
		return propietario;
	}
	
	public void setPropietario(Persona propietario) {
		this.propietario = propietario;
	}
	
	@Override
	public String toString() {
		return "Soy un " + this.especie + ", me llamo " + this.nombre + ", peso " + this.peso + " y mi dueño se llama " + this.propietario.getNombre();
	}
	
	public String alimentacion() {
		if (this.peso > 10) {
			return "dieta";
		} else if (this.peso < 2) {
			return "suplementada";
		} else {
			return "normal";
		}
	}
}
