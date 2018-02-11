package Prac1;

import java.util.Scanner;

public class ej6 {
	public static void main(String[] args) {
		Scanner en=new Scanner(System.in);
		System.out.print("Introduce un número entero: ");
		int n=en.nextInt();
		int max=0, num=0;
		for(int t=1;t<=n; t++) {
			int cont=0;
			for (int r=1; r<=t;r++ ) {
				if(t%r==0)
					cont++;
			}
			if (cont>=max) {
				max=cont;
				num=t;
			}
			
		}
		System.out.printf("El número con más divisores es %d (%d divisores)", num, max);
	}
}
