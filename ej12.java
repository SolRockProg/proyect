package Prac1;

public class ej12 {
	public static int contarPalabras(String cat) {
		int palabras=0;
		for (int t=0; t<cat.length()-1; t++) {
			if (cat.charAt(t)!=' ' && palabras==0) {
				palabras++;
				
			}
			if (cat.charAt(t)==' ' && cat.charAt(t+1)!=' ') {
				palabras++;
			}
		}
		return palabras;
	}

	public static void main(String[] args) {
		System.out.print(contarPalabras("Tengo una oya llena de kk"));

	}

}
