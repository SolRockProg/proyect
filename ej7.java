package Prac1;

public class ej7 {

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
		

	

}
