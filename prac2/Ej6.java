package prac2;
import java.util.*;

public class Ej6 {

	public static void main(String[] args) {
		Fecha cumple = new Fecha(3,2,1999);
		Scanner in = new Scanner (System.in);
		Fecha prueba;
		do {
			System.out.println("Introduce una fecha (DD/MM/AAAA): ");
			String[] datos = in.next().split("/");
			prueba = new Fecha (Integer.parseInt(datos[0]),Integer.parseInt(datos[1]),Integer.parseInt(datos[2]));
			switch (cumple.compareTo(prueba)) {
			case -1:
				System.out.println("Anterior");
				break;
			case 1:
				System.out.println("Posterior");
				break;
			case 0:
				System.out.println("BINGO");
				break;
			}
			
		}
		while (cumple.compareTo(prueba)!=0);
		
		
	}

}
