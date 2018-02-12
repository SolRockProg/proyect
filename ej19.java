import java.util.Arrays;

public class ej19 {
	public static int[] eliminarValor(int[] vector, int n) {
		int[] vector2 = new int[vector.length];
		int cont=0;
		for (int t = 0; t < vector.length; t++) {
			if (vector[t] != n) {
				vector2[t-cont] = vector[t];
			} else {
				int[] aux = new int[vector2.length - 1];
				for (int i = 0; i < aux.length; i++) {
					aux[i] = vector2[i];
				}
				vector2 = aux;
				cont++;
			}
		}
		return vector2;
	}

	public static void main(String[] args) {
		int[] vector2 = {1,2,3,4,4,5};
		int[] vector=eliminarValor(vector2, 1);
		System.out.println(Arrays.toString(vector));
	}

}
