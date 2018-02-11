package Prac1;

import java.util.Scanner;

public class ej3 {

	public static void main(String[] args) {
		Scanner en=new Scanner(System.in);
		System.out.print("Introduce un número entero: ");
		int n=en.nextInt();
		boolean primo=true;
		for(int x=2; x<n/2; x++) {
			if (n%x==0) {
				primo=false;
						}
			}
		if (primo && n!=1)
			System.out.print("Es primo");
		else
			System.out.print("No es primo");
			
	}

}
