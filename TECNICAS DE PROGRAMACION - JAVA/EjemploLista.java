// LAS LISTAS FORMAN PARTE DE LAS COLECCIONES EN JAVA, AL IGUAL QUE LOS VECTORES.
// A DIFERENCIA DE ESTOS, SU TAMAÑO PUEDE VARIAR SEGÚN SEA NECESARIO. NO SON TAN EFICIENTES 
// COMO LOS VECTORES. UTILIZAR CUANDO EN EL MOMENTO DE LA INICIALIZACION NO CONOCEMOS EL
// TAMAÑO FINAL DESEADO.

import java.util.ArrayList;

public class EjemploLista {
	public static void main(String args[]) {
		// CREACIÓN E INICIALIZACION DE UNA LISTA DE STRINGS...
		ArrayList<String> miLista = new ArrayList<String>();
		
		// SE AGREGAN ELEMENTOS A LA LISTA...
		miLista.add("Martin");
		miLista.add("Belen");
		miLista.add("German");
		
		// MOSTRAMOS LA LISTA, DETERMINANSO SU TAMAÑO A TRAVÉS DEL METODO SIZE
		System.out.println("Lista inicial:");
		for(int i = 0; i <= miLista.size() -1; i++){
			System.out.println(miLista.get(i));
		}
		
		// SE BORRA UN ELEMENTO DE LA LISTA, EN ESTE CASO, EL NOMBRE GERMAN 
		// (RECORDAR QUE TANTO EL INDICE DE LAS LISTAS COMO EL DE LOS ARREGLOS COMIENZAN EN 0)
		System.out.println("\nSe borra un elemento:");
		miLista.remove(2);
		
		// MOSTRAMOS LA LISTA, DETERMINANSO SU TAMAÑO A TRAVÉS DEL METODO SIZE
		for(int i = 0; i <= miLista.size() -1; i++){
			System.out.println(miLista.get(i));
		}
		
		// REEMPLAZAMOS EL SEGUNDO ELEMENTO (BELEN) POR JUAN JOSÉ
		miLista.set(1, "Juan José");
		
		// MOSTRAMOS LA LISTA, DETERMINANSO SU TAMAÑO A TRAVÉS DEL METODO SIZE
		System.out.println("\nSe reemplaza un elemento:");
		for(int i = 0; i <= miLista.size() -1; i++){
			System.out.println(miLista.get(i));
		}
	}
}
