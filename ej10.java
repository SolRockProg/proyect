package Prac1;

import java.util.Scanner;

public class ej10 {
	public static int contarDivisores(int n) {
		int cont=0;
		for(int t=1; t<=n; t++ )
			if(n%t==0)
				cont++;
	return cont;	
	}
	public static void main(String[] args) {
		Scanner en=new Scanner(System.in);
		System.out.print("Introduce un número entero: ");
		int n=en.nextInt();
		int max=0, num=0;
		for(int t=1;t<=n; t++) {
		
			if (contarDivisores(t)>=max) {
				max=contarDivisores(t);
				num=t;
			}
			
		}
		System.out.printf("El número con más divisores es %d (%d divisores)", num, max);
	}
}
