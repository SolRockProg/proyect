package prac1;

public class ej20 {
	public static boolean contiene (int [] vector, int n) {
		for (int x: vector)
			if (x==n)
				return true;
		return false;
	}
	
	public static boolean contiene (int[] vector1, int[] vector2) {
		for (int f: vector2)
			if (!contiene(vector1,f))
				return false;
		return true;
	}

	public static void main (String args[]) {
		int[] v1 = {5,4,2,9,6,7,1};
		int[] v2 = {6,9,4,1,7,5,2};
		int[] v3 = {8,1,3,7,9,6,4};
		System.out.println(contiene(v1,9));
		System.out.println(contiene(v1,3));
		System.out.println(contiene(v1,v2));
		System.out.println(contiene(v1,v3));

	}
	
}
