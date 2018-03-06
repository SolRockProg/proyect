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
		int[] conjuntovacío = {};
		System.out.print("9 está en v1{5,4,2,9,6,7,1}: ");
		System.out.println(contiene(v1,9));
		System.out.print("3 está en v1{5,4,2,9,6,7,1}: ");
		System.out.println(contiene(v1,3));
		System.out.print("Todos los elementos de v2{6,9,4,1,7,5,2} están en v1{5,4,2,9,6,7,1}: ");
		System.out.println(contiene(v1,v2));
		System.out.print("Todos los elementos de v3{8,1,3,7,9,6,4} están en v1{5,4,2,9,6,7,1}: ");
		System.out.println(contiene(v1,v3));
		System.out.print("Todos los elementos de {} están en v1{5,4,2,9,6,7,1}: ");
		System.out.println(contiene(v1,conjuntovacío));
		System.out.print("{} está en {}: ");
		System.out.println(contiene(conjuntovacío,conjuntovacío));
		System.out.print("Todos los elementos de v2{6,9,4,1,7,5,2} están en {}: ");
		System.out.println(contiene(conjuntovacío,v2));
		
	
	}
	
}
