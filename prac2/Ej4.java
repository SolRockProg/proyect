package prac2;
import java.*;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Scanner;
import prac2.Restaurante;
public class Ej4 {
	
	public static Restaurante restauranteM�sValorado (Restaurante[] v, Punto p, double distancia) {
		Restaurante cercano_bueno = v[0];
		double dis_inicial = v[0].
		for (int i=1;i<)
		}
	}
	
	public static void main(String[] args) throws FileNotFoundException{
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce el nombre de un fichero de texto: ");
		String nombreFichero = in.next();
		System.out.println("�D�nde est�s? (coordenada X): ");
		int x = in.nextInt();
		System.out.println("�D�nde est�s? (coordenada Y): ");
		int y = in.nextInt();
		System.out.println("�Cu�nto est�s dispuesto a caminar?");
		double max = in.nextDouble();
		Restaurante[] vector = Restaurante.leeRestaurantes(nombreFichero);
		Punto posici�n = new Punto (x,y);
		
		
	}
}