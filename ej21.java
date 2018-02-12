
public class ej21 {
	public static int posiciónInserción(int[] vector,int n) {
		for (int t = 0; t < vector.length; t++) {
			if (vector[t] == n)
				return t;
			else {
				if (vector[t] > n)
					return t;
			}
		}
		return vector.length;
	}

	public static void main(String[] args) {
		int[] vector= {1,4,5,6,7};
		System.out.print(posiciónInserción(vector, 8));
	}

}
