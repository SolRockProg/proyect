package prac1;

public class ej16 {
	public static int contarOlasDeFrío (double[] vector, int n) {
		int olas=0;
		int cont=0;
		for (double este: vector) {
			if (este<0)
				cont++;
			else
				cont=0;
			if (cont==n)
				olas++;
		}
		return olas;
	}
	public static void main(String[] args) {
		double[] temp = {5,4,-2,-1,-2,6,7,-6,-3,-9,6,9,-7,6};
		System.out.println(contarOlasDeFrío(temp,3));
	}

}
