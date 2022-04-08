package utec.laboratorio.tiposdedatos;

import java.util.Scanner;

public class TiposDeDatos {

	public static void main(String[] args) {
		
		// Leo los numeros desde la consola
		Scanner lectura = new Scanner (System.in);
		
		System.out.println("Ingrese el número A:");
		double numA = lectura.nextDouble();
		
		System.out.println("Ingrese el número B:");
		double numB = lectura.nextDouble();
		
		System.out.println("Ingrese el número C:");
		double numC = lectura.nextDouble();
		
		lectura.close();
		// Fin lectura
		
		// Suma
		double sumaABC = numA + numB + numC;
		System.out.println("La suma de A,B y C es: " + sumaABC);
		
		// Promedio
		double promABC = sumaABC / 3.0;
		System.out.println("El promedio de A,B y C es: " + promABC);
		
		// Diferencia entre A y B
		double difAB = numA - numB;
		System.out.println("La diferencia entre A y B es: " + difAB);
		
		// Cociente entre B y C
		double relBC = numB / numC;
		System.out.println("El cociente entre B y C es: " + relBC);
				
		// Comparo A y C para ver si son iguales
		boolean comparaAC = numA == numC;
		if (comparaAC) {
			System.out.println("Los numeros A y C son iguales.");
		} else {
			System.out.println("Los numeros A y C son diferentes.");
		}
		
	}

}
