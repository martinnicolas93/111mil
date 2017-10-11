import java.util.Random;

public class EjemploBurbujeo2 {
	public static void main(String args[]) {
		final int SIZE = 100000;
		int Vector[] = new int[SIZE];
		
		for(int i = 0; i < SIZE; i++) {
			Vector[i] = (int)(Math.random() * 1000000) + 1;
		}
		
		for(int j = 0; j < SIZE -1; j++) {
			for(int k = j + 1; k < SIZE; k++) {
				if(Vector[j] > Vector[k]) {
					int auxiliary = Vector[j];
					Vector[j] = Vector[k];
					Vector[k] = auxiliary;
				}
			}
		}
		
		
		for(int i = 0; i < SIZE; i++) {
			System.out.println(String.valueOf(Vector[i]));
		}
	}
}
