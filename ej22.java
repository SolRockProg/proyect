package prac1;

public class ej22 {
	
	public static int contarOlasDeFr�o (double[] vector, int n) {
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
	
	public static int m�sOlasDeFr�o (double[][] siglo, int min) {
		int peor=0;
		int a�o=0;
		for (int i=0;i<siglo.length;i++) {
			if (contarOlasDeFr�o(siglo[i],min)>=peor) {
				peor=contarOlasDeFr�o(siglo[i],min);
				a�o=i+1900;
			}
		}
		return a�o;
	}
	public static void main(String[] args) {
		double[][] matriz1 = {{7,-6,-4,9},{-1,-2,-3,7},{-4,5,6,-2}};
		double[][] matriz2 = {{7,-6,-4,-9,-7,-1},{-1,-2,-3,7,6,6},{-4,5,6,6,-2,-3}};
		System.out.println(m�sOlasDeFr�o(matriz1,3));
		System.out.println(m�sOlasDeFr�o(matriz2,4));
	}

}
