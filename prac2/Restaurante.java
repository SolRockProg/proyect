package prac2;
import java.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Restaurante {
	private String nombre;
	private Punto posición;
	private int valoración;
	
	public Restaurante (String nombre, Punto posición, int valoración) {
		this.nombre = nombre;
		this.posición = posición;
		this.valoración = valoración;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public Punto getPosición() {
		return this.posición;
	}
	public int getValoración() {
		return this.valoración;
	}
	
	public double distancia (Punto p) {
		return posición.distancia(p);
	}
	public static Restaurante[] leeRestaurantes(String nombreFichero) throws FileNotFoundException {
		Scanner in = new Scanner (new File(nombreFichero));
		int N = in.nextInt();
		Restaurante[] vector = new Restaurante[N];
		for (int i=0;i<N;i++) {
			Punto punto = new Punto(in.nextDouble(),in.nextDouble());
			int valor = in.nextInt();
			String nombre = in.next();
			Restaurante restaurante = new Restaurante(nombre,punto,valor);
			vector[i]=restaurante;
		}
		in.close();
		return vector;
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		Punto aquí =  new Punto(0,0);
		Restaurante restaurante1 = new Restaurante("Pinocho", aquí, 7);
		System.out.println(restaurante1.getValoración());
		System.out.println(restaurante1.getPosición().toString());
		
		Restaurante[] prueba1 = leeRestaurantes("restaurantes.txt");
		for (int i=0;i<prueba1.length;i++) {
			System.out.println(prueba1[i].getNombre() + " " + prueba1[i].getValoración() + " " + prueba1[i].getPosición());
		}
	}
	
}


