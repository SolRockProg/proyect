package Prac1;

public class ej11 {
	public static boolean esSufijo(String cad1, String  cad2) {
		for(int n=cad1.length()-1; n>cad1.length()-cad2.length()-1; n--) {
			if (cad1.charAt(n)!=cad2.charAt(n-cad1.length()+cad2.length()))
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.print(esSufijo("juan de troya","oyo"));

	}

}
