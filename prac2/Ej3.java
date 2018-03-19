package prac2;
import java.*;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Scanner;
import prac2.Restaurante;
public class Ej3 {
	

	
	public static Restaurante restauranteMásPróximo (Restaurante[] v, Punto p) throws FileNotFoundException{
		double min = v[0].getPosición().distancia(p);
		Restaurante cercano = v[0];
		for (int i=1;i<v.length;i++) {
			if (v[i].getPosición().distancia(p)<min) {
				min=v[i].getPosición().distancia(p);
				cercano = v[i];
			}
		}
		return cercano;
	}
	
	public static void main(String[] args) throws FileNotFoundException{
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce el nombre de un fichero de texto: ");
		String nombreFichero = in.next();
		System.out.println("¿Dónde estás? (coordenada X): ");
		int x = in.nextInt();
		System.out.println("¿Dónde estás? (coordenada Y): ");
		int y = in.nextInt();
		
		Restaurante[] vector = Restaurante.leeRestaurantes(nombreFichero);
		Punto posición = new Punto (x,y);
		
		System.out.print("El restaurante más cercano a su posición es "+restauranteMásPróximo(vector,posición).getNombre()+" situado en el punto "+restauranteMásPróximo(vector,posición).getPosición() );
		
	}
}