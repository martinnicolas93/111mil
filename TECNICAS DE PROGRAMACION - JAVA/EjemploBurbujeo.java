// EL BURBUJEO ES UN ALGORITMO DE ORDENAMIENTO DE VECTORES MUY POPULAR DADA SU SIMPLICIDAD,
// AUNQUE NO ES MUY EFICIENTE. FUNCIONA BIEN CON VECTORES PEQUEÑOS, PERO EN GRANDES 
// MAGNITUDES CONVIENE UTILIZAR ALGUNA OTRA SOLUCIÓN, COMO QUICK SORT POR EJEMPLO.

import java.util.Scanner;

public class EjemploBurbujeo {
	public static void main(String[] args) {
		// CONSTANTE PARA DEFINIR EL TAMAÑO DEL VECTOR
		final int SIZE = 10;
		
		// CREAMOS UN OBJETO DE LA CLASE SCANNER PARA EL INGRESO DE DATOS
		Scanner keyboard = new Scanner(System.in);
		
		// EL VECTOR VECTOR SE DIMENCIONA EN FUNCIÓN DE LA CONSTANTE SIZE
		int vector[] = new int[SIZE];
		
		// CARGA DEL VECTOR CON DATOS DE TIPO NUMÉRICO ENTERO...
		for(int i = 0; i <= SIZE -1; i++) {
			System.out.print("ingrese un número: ");
			vector[i] = keyboard.nextInt();
		}
		
		// AQUÍ COMIENZA EL ORDENAMIENTO. LA TECNICA CONSISTE EN DOS CICLOS DE 
		// REPETICIÓN CONTROLADOS POR CONTADOR ANIDADOS. EL PRIMER CICLO, j, ARRANCA DESDE
		// LA PRIMERA POSICIÓN DEL VECTOR, HASTA LA ANTEÚLTIMA POSICIÓN...
		for(int j = 0; j <= SIZE - 2; j++) {
		
			// EL SEGUNDO CICLO, k, ARRANCA DESDE j HASTA LA ÚLTIMA POSICIÓN...
			for(int k = j + 1; k <= SIZE -1; k++) {
				
				// SE COMPARA LA POSICIÓN DEL VECTOR EN j CONTRA LA POSICIÓN DE VECTOR EN k
				// COMO SE REQUIERE UN ORDENAMIENTO ASCENDENTE EL OPERADOR LÓGICO VA A SER ">"
				// SI VECTOR[j] ES MAYOR QUE VECTOR[k], SE CREA UNA VARIABLE AUXILIAR Y SE INVIERTEN 
				// LOS VALORES
				if(vector[j] > vector[k]) {
					int auxiliary = vector[j];
					
					vector[j] = vector[k];
					
					vector[k] = auxiliary;
				}
			}
		}
		
		// SE MUESTRA EL VECTOR ORDENADO...
		for(int i = 0; i <= SIZE -1; i++) {
			System.out.println(vector[i]);
		}
	}
}
