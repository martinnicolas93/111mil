import java.util.HashMap;

public class EjemploMap {
	public static void main(String[] args) {
		// HashMap es una colección del tipo clave / valor.
		// Acá declaro un HashMap con String para la clave y Float para el valor.
		// Siempre usar clases, nunca tipos de datos primitivos
		HashMap<String, Float> myMap = new HashMap<String, Float>();
		
		// Utilizar el método put para agregar elementos
		myMap.put("Lo Que el Viento se Llevo", 500f);
		myMap.put("Matrix", 600f);
		myMap.put("Blade Runner", 600f);
		
		System.out.println("\nPrimer recorrido del hashMap:");
		
		// Recorrer el HashMap con un for
		for(String key : myMap.keySet()) {
			Float value = myMap.get(key);
			System.out.println(key + " " + String.valueOf(value));
		}
		
		System.out.println("\nSe suman 10 a Matrix:");
		
		// Modificación del valor de un elemento del HashMap
		myMap.put("Matrix", myMap.get("Matrix") + 10f);
		
		for(String key : myMap.keySet()) {
			Float value = myMap.get(key);
			System.out.println(key + " " + String.valueOf(value));
		}
		
		// Remover un elemento del HashMap en función de la clave
		myMap.remove("Matrix");
		
		System.out.println("\nSe eliminó Matrix:");
		
		for(String key : myMap.keySet()) {
			Float value = myMap.get(key);
			System.out.println(key + " " + String.valueOf(value));
		}
	}
}
