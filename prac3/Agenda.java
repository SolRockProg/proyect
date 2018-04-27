package prac3;
import java.util.*;

public class Agenda {
	private ArrayList<Tarea> lista = new ArrayList<Tarea>();
	
	public Agenda() {
		lista = new ArrayList<Tarea>();
	}

	public void añadir(Tarea tarea) {
		int posición=0;
		for (Tarea t: lista) {
			if (tarea.getFecha().compareTo(t.getFecha())>0) posición++;
		}
		lista.add(posición,tarea);
	}
	
	public int cantidad() {
		return lista.size();
	}

	public ArrayList<Tarea> consultar(Fecha fecha) {
		ArrayList<Tarea> coincide = new ArrayList<Tarea>();
		for (Tarea t: lista) {
			if (fecha.compareTo(t.getFecha())==0)
				coincide.add(t);
		}
		return coincide;
	}

	public void borrarPasadas(Fecha fecha) {
		while (fecha.compareTo(lista.get(0).getFecha())==1) {
			lista.remove(0);
		}
	}

	public void borrar() {
		Fecha hoy = Fecha.hoy();
		borrarPasadas(hoy);
	}

	public String toString() {
		String cad = "";
		for (Tarea t: lista) {
			cad+=t.getFecha().toString() +": "+ t.getDescripción() + "\n";
		}
		return cad;
	}
}