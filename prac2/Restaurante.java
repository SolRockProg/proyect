package prac2;
import java.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Restaurante {
	private String nombre;
	private Punto posici�n;
	private int valoraci�n;
	
	public Restaurante (String nombre, Punto posici�n, int valoraci�n) {
		this.nombre = nombre;
		this.posici�n = posici�n;
		this.valoraci�n = valoraci�n;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public Punto getPosici�n() {
		return this.posici�n;
	}
	public int getValoraci�n() {
		return this.valoraci�n;
	}
	
	public double distancia (Punto p) {
		return posici�n.distancia(p);
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
		Punto aqu� =  new Punto(0,0);
		Restaurante restaurante1 = new Restaurante("Pinocho", aqu�, 7);
		System.out.println(restaurante1.getValoraci�n());
		System.out.println(restaurante1.getPosici�n().toString());
		
		Restaurante[] prueba1 = leeRestaurantes("restaurantes.txt");
		for (int i=0;i<prueba1.length;i++) {
			System.out.println(prueba1[i].getNombre() + " " + prueba1[i].getValoraci�n() + " " + prueba1[i].getPosici�n());
		}
	}
	
}


