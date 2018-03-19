package prac2;
import java.*;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Scanner;
import prac2.Restaurante;
public class Ej3 {
	

	
	public static Restaurante restauranteM�sPr�ximo (Restaurante[] v, Punto p) throws FileNotFoundException{
		double min = v[0].getPosici�n().distancia(p);
		Restaurante cercano = v[0];
		for (int i=1;i<v.length;i++) {
			if (v[i].getPosici�n().distancia(p)<min) {
				min=v[i].getPosici�n().distancia(p);
				cercano = v[i];
			}
		}
		return cercano;
	}
	
	public static void main(String[] args) throws FileNotFoundException{
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce el nombre de un fichero de texto: ");
		String nombreFichero = in.next();
		System.out.println("�D�nde est�s? (coordenada X): ");
		int x = in.nextInt();
		System.out.println("�D�nde est�s? (coordenada Y): ");
		int y = in.nextInt();
		
		Restaurante[] vector = Restaurante.leeRestaurantes(nombreFichero);
		Punto posici�n = new Punto (x,y);
		
		System.out.print("El restaurante m�s cercano a su posici�n es "+restauranteM�sPr�ximo(vector,posici�n).getNombre()+" situado en el punto "+restauranteM�sPr�ximo(vector,posici�n).getPosici�n() );
		
	}
}