package Prac2;
import java.*;
public class testAgenda {

	public static void main(String[] args) {
		
		Tarea tarea_1 = new Tarea (new Fecha(7,1,1980),"pedro");
		Tarea tarea_4 = new Tarea (new Fecha(5,5,2020),"pedro");
		Tarea tarea_2 = new Tarea (new Fecha(3,2,1999),"pedro");
		Tarea tarea_3 = new Tarea (Fecha.hoy(),"pedro");
		int[] vector= new int[0];
		System.out.print(vector.length);
		Agenda agenda = new Agenda();
		agenda.añadir(tarea_1);
		agenda.añadir(tarea_4);
		agenda.añadir(tarea_2);
		agenda.añadir(tarea_3);
		
		System.out.print(agenda.toString());
	}

}
