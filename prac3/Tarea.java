package prac3;
import java.*;
import java.util.*;
public class Tarea {
	private Fecha fecha;
	private String descripción;
	public Tarea(Fecha fecha, String descripción) {
		this.fecha=fecha;
		this.descripción=descripción; 
	}
	public Fecha getFecha() {
		return this.fecha;
	}
	public String getDescripción() {
		return this.descripción;
	}
	public String toString() {
		return this.fecha.toString()+": "+this.descripción;
	}
	


public static void main(String[] args) {
	Fecha nueva=new Fecha(12,3,1999);
	Tarea cosa=new Tarea(nueva, "me llamo Gilipollas");
	System.out.print(cosa.toString());
}
}