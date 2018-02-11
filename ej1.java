package Prac1;
import java.util.*;

public class ej1 {

	public static void main(String[] args) {
		Scanner en=new Scanner(System.in);
		System.out.print("Introduce un número entero: ");
		int n=en.nextInt();
		int aux=n;
		for (int t=n-1;t>0;t--)
			n*=t;
		System.out.printf("%d! = %d",aux, n);
	}

}
