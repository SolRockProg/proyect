package Prac1;

public class ej13 {
	public static String obtenerPalabra( String cad,int n) {
		int palabras=0, p=0,f=0;
		for (int t=0; t<cad.length()-1; t++) {
			if (cad.charAt(t)!=' ' && palabras==0) {
				palabras++;
				
			}
			if (cad.charAt(t)==' ' && cad.charAt(t+1)!=' ') {
				palabras++;
			
			if (palabras==n) 
				p=t+1;
			if (palabras==n+1)
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
