public class ej13 {
	public static String obtenerPalabras(String cat, int i) {
		int palabras = 0;
		String newP = "";
		if (i <= cat.length()-1) {
			for (int t = 0; t < cat.length(); t++) {
				if (cat.charAt(t) != ' ' && palabras == 0) {
					palabras++;

				}
				if (cat.charAt(t) == ' ' && cat.charAt(t + 1) != ' ') {
					palabras++;
				}
				if (palabras == i && cat.charAt(t)!=' ') {
					newP += cat.charAt(t);
				}

			}
			return newP;
		} else
			return null;

	}

	public static void main(String[] args) {
		System.out.print(obtenerPalabras("hola muy buenas tardes", 3));

	}
}
