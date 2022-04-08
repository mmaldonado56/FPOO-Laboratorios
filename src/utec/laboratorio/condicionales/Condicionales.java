package utec.laboratorio.condicionales;

import java.io.IOException;
import java.util.Scanner;

public class Condicionales {

	public static void main(String[] args) throws IOException {
		
		int option = 0;
		Scanner lectura = new Scanner(System.in);

		do {
			
			System.out.println("Bienvenido!");
			System.out.println("Seleccione una opción del menú:");
			System.out.println("    1 - Obtiene el mayor de 2 números enteros.");
			System.out.println("    2 - Obtiene la cantidad de cifras de un numero entre 0 y 99999.");
			System.out.println("    3 - Inicia sesión.");
			System.out.println("    4 - Deternima si un número es múltiplo de 10.");
			System.out.println("Ingresa 0 para salir.");
			
			option = lectura.nextInt();
			
			switch(option) {
				case 1:
					obtenerMayor(lectura);
					break;
				
				case 2:
					obtenerCantCifras(lectura);
					break;
					
				case 3:
					iniciarSesion(lectura);
					break;
					
				case 4:
					esMultiploDe10(lectura);
					break;
					
				case 0: break;
				
				default:
					System.out.println("La opción ingresada no es válida.");
			}
			
		} while (option != 0);
				
		lectura.close();
	}

	public static void obtenerMayor(Scanner lectura) {
		// 1.
		// Solicitar 2 numeros enteros
		System.out.println("Ingrese un numero entero (Numero1):");
		int num1 = lectura.nextInt();
		
		System.out.println("Ingrese un numero entero (Numero2):");
		int num2 = lectura.nextInt();
		
		// Indico cual es el mayor
		if (num1 > num2) {
			System.out.println("Numero1 es mayor que Numero2.");
		} else if (num1 == num2) {
			System.out.println("Los numeros ingresados son iguales.");
		} else {
			System.out.println("Numero2 es mayor que Numero1.");
		}
	}

	public static void obtenerCantCifras(Scanner lectura) {
		// 2.
		// Solicitar numero entero		
		System.out.println("Ingrese un numero entero entre 0 y 99999:");
		int numEntero = lectura.nextInt();
				
		// Ver cuantas cifras tiene.
		int cantCifras = 0;
		for (cantCifras = 1; cantCifras <= 5; cantCifras ++) {
			if (numEntero < Math.pow(10, cantCifras)) {
				break;
			}
		}
		
		System.out.println("En numero " + numEntero + " tiene " + cantCifras + " cifras.");
	}

	public static void iniciarSesion(Scanner lectura) {
		// 3.
		// Solicitar usuario y contrasena
		System.out.println("Username:");
		String username = lectura.nextLine();
		
		System.out.println("Password:");
		String password = lectura.nextLine();
		
		if (username.equals("matias") && password.equals("utec123")) {
			System.out.println("Login success.");
		} else {
			System.out.println("Login failed. Invalid username or password.");
		}
		
		// En caso de login incorrecto siempre hay que responder con el mismo mensaje "usuario o contrasena incorrecto"
		// De otro modo puedes probar distintos usuarios al azar y chequeando el mensaje obtenido puedes saber
		// que usuarios tienes en el sistema.
		// Esto es una vulnerabilidad ya que un atacante podria aprovecharse del mensaje para identificar que nombres de 
		// usuario estan en uso.
	}

	public static void esMultiploDe10(Scanner lectura) {
		// 4.
		// Solicitar numero entero
		System.out.println("Ingrese un numero entero:");
		int numEntero = lectura.nextInt();
				
		// Verifico que sea multiplo de 10 utilizando la operacion de modulo
		if (numEntero % 10 == 0) {
			System.out.println("El numero " + numEntero + " es multiplo de 10.");
		} else {
			System.out.println("El numero " + numEntero + " no es multiplo de 10.");
		}
	}
}
