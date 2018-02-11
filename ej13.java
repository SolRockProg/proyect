

public class ej13 {
	public static String obtenerPalabras(String cat, int n) {
		int palabras=0;
		String newP="";
		for (int t=0; t<cat.length()-1; t++) {
			if (cat.charAt(t)!=' ' && palabras==0) {
				palabras++;
				
			}
			if (cat.charAt(t)==' ' && cat.charAt(t+1)!=' ') {
				palabras++;
			}
			if (palabras==n) {
				newP+=cat.charAt(t);
			}
			
		}
		return newP;
	}

	public static void main(String[] args) {
		System.out.print(obtenerPalabras("Tengo una oya llena de kk",1));

	}
}
