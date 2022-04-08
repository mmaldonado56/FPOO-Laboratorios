package utec.laboratorio.clases;

public class Programa {

	public static void main(String[] args) {
		
		Persona persona1 = new Persona();
		persona1.setNombre("Matias");
		persona1.setApellido("Maldonado");
		persona1.setCedula("2459234-2");
		
		Mascota mascota1 = new Mascota("Katy", persona1);
		mascota1.setEspecie("Perro");
		mascota1.setPeso(15);
	
		Mascota mascota2 = new Mascota("Ringo", persona1);
		mascota2.setEspecie("Caballo");
		mascota2.setPeso(70);
		
		////////
		
		Persona persona2 = new Persona("Carlos", "Rodriguez");
		persona2.setCedula("3859274-8");
		
		Mascota mascota3 = new Mascota("Gavilan", persona2);
		mascota3.setEspecie("Pajaro");
		mascota3.setPeso(0.5f);
		
		////////
		
		System.out.println(" ==== FAMILIA 1 ====");
		System.out.println(" Datos del propietario:");
		System.out.println("     Nombre: " + persona1.getNombre());
		System.out.println("     Apellido: " + persona1.getApellido());
		System.out.println("     Cedula: " + persona1.getCedula());
		System.out.println("     Presentacion: " + persona1.toString());
		System.out.println();
		
		System.out.println(" Datos primer mascota:");
		System.out.println("     Nombre: " + mascota1.getNombre());
		System.out.println("     Especie: " + mascota1.getEspecie());
		System.out.println("     Peso: " + mascota1.getPeso());
		System.out.println("     Alimentacion: " + mascota1.alimentacion());
		System.out.println("     Nombre propietario: " + mascota1.getPropietario().getNombre());
		System.out.println("     Presentacion: " + mascota1.toString());
		System.out.println();
		
		System.out.println(" Datos segunda mascota:");
		System.out.println("     Nombre: " + mascota2.getNombre());
		System.out.println("     Especie: " + mascota2.getEspecie());
		System.out.println("     Peso: " + mascota2.getPeso());
		System.out.println("     Alimentacion: " + mascota2.alimentacion());
		System.out.println("     Nombre propietario: " + mascota2.getPropietario().getNombre());
		System.out.println("     Presentacion: " + mascota2.toString());
		System.out.println();
		System.out.println();
		
		System.out.println(" ==== FAMILIA 2 ====");
		System.out.println(" Datos del propietario:");
		System.out.println("     Nombre: " + persona2.getNombre());
		System.out.println("     Apellido: " + persona2.getApellido());
		System.out.println("     Cedula: " + persona2.getCedula());
		System.out.println("     Presentacion: " + persona2.toString());
		System.out.println();
		
		System.out.println(" Datos primer mascota:");
		System.out.println("     Nombre: " + mascota3.getNombre());
		System.out.println("     Especie: " + mascota3.getEspecie());
		System.out.println("     Peso: " + mascota3.getPeso());
		System.out.println("     Alimentacion: " + mascota3.alimentacion());
		System.out.println("     Nombre propietario: " + mascota3.getPropietario().getNombre());
		System.out.println("     Presentacion: " + mascota3.toString());
	}

}
