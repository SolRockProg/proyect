package prac3;
import java.*;
import java.util.Arrays;
public class testAgenda {

	public static void main(String[] args) {
		
		Tarea tarea_1 = new Tarea (new Fecha(7,1,1980),"pedro");
		Tarea tarea_4 = new Tarea (new Fecha(5,5,2020),"ambrosio");
		Tarea tarea_2 = new Tarea (new Fecha(3,2,1999),"andro");
		Tarea tarea_5 = new Tarea (new Fecha(3,2,2000),"sebatiano");
		Tarea tarea_3 = new Tarea (Fecha.hoy(),"anastasio");
		int[] vector= new int[0];
		Agenda agenda = new Agenda();
		System.out.println("Agenda 1");
/*1*/	agenda.añadir(tarea_1);
		agenda.añadir(tarea_4);
		agenda.añadir(tarea_2);
		agenda.añadir(tarea_3);
		agenda.añadir(tarea_5);
		agenda.añadir(tarea_5);
		System.out.println(agenda.toString());
/*2*/	System.out.println(agenda.cantidad());
		Fecha hola=new Fecha(7,1,1980);
/*3*/	System.out.println(agenda.consultar(hola).toString());
		Fecha hola2=new Fecha(3,2,1999);
		Agenda agenda2 = new Agenda();
		System.out.println("Agenda 2");
		agenda2.añadir(tarea_1);
		agenda2.añadir(tarea_4);
		agenda2.añadir(tarea_2);
		agenda2.añadir(tarea_3);
		agenda2.añadir(tarea_5);
		agenda2.borrarPasadas(hola2);
		System.out.println(agenda2.toString());
		Fecha hola3=new Fecha(3,2,1999);
/*4*/	Agenda agenda3 = new Agenda();
		System.out.println("Agenda 3");
		agenda3.añadir(tarea_1);
		agenda3.añadir(tarea_4);
		agenda3.añadir(tarea_2);
		agenda3.añadir(tarea_3);
		agenda3.añadir(tarea_5);
		agenda3.borrar();
		System.out.println(agenda3.toString());
		
	}
}