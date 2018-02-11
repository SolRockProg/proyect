
public class ej17 {
	public static boolean hayRepetidos(int[] vector) {
		for (int t = 0; t < vector.length; t++) {
			for (int j = t+1; j < vector.length; j++) {
				if (vector[t] == vector[j]) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] vector= {1,2,4,3};
		System.out.print(hayRepetidos(vector));
	}

}
