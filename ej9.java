package Prac1;

import java.util.Scanner;

public class ej9 {

	public static boolean esPrimo(int n) {
		boolean primo=true;
		if (n==1)
			return false;
		for(int x=2; x<=n/2; x++) {
			if (n%x==0) {
				primo=false;
		
						}
			}
		
		return primo;
	}
	public static void main(String[] args) {
			Scanner en=new Scanner(System.in);
			System.out.print("Introduce un número entero: ");
			int n=en.nextInt();
			int resultado=1;
			for  (int t=1; t<=n; t++) {
				
				if (esPrimo(t))
					resultado*=t;

	}
			System.out.printf("%d# = %d", n, resultado);
	}
	}


