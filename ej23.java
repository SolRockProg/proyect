package prac1;
import java.util.*;
public class ej23 {
	public static boolean est·EnTodasLasColumnas(int[][] matriz, int n) {
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
		System.out.print("2 est· en todas las columas de matriz: ");
		System.out.println(est·EnTodasLasColumnas(matriz1, 2));
		System.out.print("5 est· en todas las columas de matriz2: ");
		System.out.println(est·EnTodasLasColumnas(matriz2, 5));
		System.out.print("6 est· en todas las columas de matriz2: ");
		System.out.println(est·EnTodasLasColumnas(matriz2, 6));
		System.out.print("4 est· en todas las columas de matriz_elemento: ");
		System.out.println(est·EnTodasLasColumnas(matriz_elemento, 4));
		System.out.print("5 est· en todas las columas de matriz_elemento: ");
		System.out.println(est·EnTodasLasColumnas(matriz_elemento, 5));
	}

}