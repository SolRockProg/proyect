package prac1;

public class ej22 {
	
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
	
	public static int másOlasDeFrío (double[][] siglo, int min) {
		int peor=0;
		int año=0;
		for (int i=0;i<siglo.length;i++) {
			if (contarOlasDeFrío(siglo[i],min)>=peor) {
				peor=contarOlasDeFrío(siglo[i],min);
				año=i+1900;
			}
		}
		return año;
	}
	public static void main(String[] args) {
		double[][] matriz1 = {{7,-6,-4,9},{-1,-2,-3,7},{-4,5,6,-2}};
		double[][] matriz2 = {{7,-6,-4,-9,-7,-1},{-1,-2,-3,7,6,6},{-4,5,6,6,-2,-3}};
		System.out.println(másOlasDeFrío(matriz1,3));
		System.out.println(másOlasDeFrío(matriz2,4));
	}

}
