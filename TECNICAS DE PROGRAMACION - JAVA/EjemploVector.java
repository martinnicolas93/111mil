// LOS VECTORES FORMAN PARTE (AL IGUAL QUE LAS LISTAS) DE LAS COLECCIONES EN JAVA.
// SON MAS EFICIENTES YA QUE SUS NODOS SE ENCUENTRAN ADYACENTES EN LA MEMORIA, PERO
// SU TAMAÑO SE PREDEFINE AL MOMENTO DE SU INICIALIZACIÓN Y NO PUEDE VARIARSE.

import java.util.Scanner;

public class EjemploVector {
	public static void main(String[] args){
		// CONSTANTE PARA DEFINIR EL TAMAÑO DEL VECTOR
		final int SIZE = 10;
		
		// CREAMOS UN OBJETO DE LA CLASE SCANNER PARA EL INGRESO DE DATOS
		Scanner keyboard = new Scanner(System.in);
		
		// CREAMOS E INICIALIZAMOS EL VECTOR EN BASE A SIZE...
		int numbers[] = new int[SIZE];
		
		// CARGAMOS EL VECTOR (RECORDAR QUE EL PRIMER NODO ES EL 0)
		for(int i = 0; i <= 9; i++) {
			System.out.print("Ingrese un número: ");
			numbers[i] = keyboard.nextInt();
		}
		
		// MOSTRAMOS EL VECTOR EN EL ORDEN EN EL QUE FUE CARGADO...
		System.out.println("\nAl derecho:");
		for(int i = 0; i <= 9; i++) {
			System.out.println(numbers[i]);
		}
		
		// MOSTRAMOS EL VECTOR EN EL ORDEN INVERSO AL QUE FUE CARGADO.
		// LOS VECTORES TIENEN UNA PROPIEDAD LLAMADA length QUE INDICA
		// EL TAMAÑO DEL VECTOR, Y EN ESTE CASO LA USAMOS PARA INICIALIZAR 
		// EL CONTEO REGRESIVO (A LOS FINES DEMOSTRATIVOS).
		System.out.println("\nAl revés:");
		for(int i = numbers.length - 1; i >= 0; i--) {
			System.out.println(numbers[i]);
		}
	}
}
