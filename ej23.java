package prac1;
import java.util.*;
public class ej23 {
	public static boolean estŠEnTodasLasColumnas(int[][] matriz, int n) {
		for(int i=0; i<matriz[0].length;i++) {
			int cont=0;
			for(int x=0; x<matriz.length; x++) {
				if (matriz[x][i]!=n) 
					cont++;
				if (cont==matriz.length) {
					return false;	
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[][] matriz1= {{1,2,3},{1,2,2}};
		int[][] matriz2 = {{5,4,2,9},{6,7,5,1},{0,3,8,5},{6,5,7,4}};
		int[][] matriz_elemento = {{4}};
		System.out.print("2 estŠ en todas las columas de matriz: ");
		System.out.println(estŠEnTodasLasColumnas(matriz1, 2));
		System.out.print("5 estŠ en todas las columas de matriz2: ");
		System.out.println(estŠEnTodasLasColumnas(matriz2, 5));
		System.out.print("6 estŠ en todas las columas de matriz2: ");
		System.out.println(estŠEnTodasLasColumnas(matriz2, 6));
		System.out.print("4 estŠ en todas las columas de matriz_elemento: ");
		System.out.println(estŠEnTodasLasColumnas(matriz_elemento, 4));
		System.out.print("5 estŠ en todas las columas de matriz_elemento: ");
		System.out.println(estŠEnTodasLasColumnas(matriz_elemento, 5));
	}

}