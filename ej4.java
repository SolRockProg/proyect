package Prac1;

import java.util.Scanner;

public class ej4 {
	public static void main(String[] args) {
		Scanner en=new Scanner(System.in);
		System.out.print("Introduce un número entero: ");
		int n=en.nextInt();
		System.out.printf("Los números primos menores que %d son: ", n);
		for  (int t=1; t<n; t++) {
			int cont=0;
			for (int r=1; r<=t/2; r++) {
				if (t%r==0)
					cont++;
				
			}
			if (cont==1)
				System.out.printf("%d ", t);
		}
						
			
	}
}
