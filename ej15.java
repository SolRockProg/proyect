
public class ej15 {
	public static boolean est·Ordenado(String[] vector) {
		for (int t = 0; t < vector.length - 1; t++) {
			if (vector[t].compareTo(vector[t + 1]) > 0) {
				return false;
			}

		}
		return true;

	}

	public static void main(String[] args) {
		String[]vector= {"a","a","c"};
		System.out.print(est·Ordenado(vector));
	}

}
