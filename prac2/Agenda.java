package Prac2;

public class Agenda {
	private Tarea[] vector;

	public Agenda() {
		this.vector = new Tarea[0];
	}

	public void añadir(Tarea tarea) {
		Tarea[] aux = new Tarea[this.vector.length + 1];
		int cont = 0;
		if (this.vector.length == 0) {
			aux[0] = tarea;
		} else {
			for (int i = 0; i < vector.length; i++) {
				if (vector[i].getFecha().compareTo(tarea.getFecha()) > 0 && cont==0) {
					cont++;
					aux[i] = tarea;
				} 
				if(vector[i].getFecha().compareTo(tarea.getFecha()) <= 0 || cont!=0) {
					aux[i+cont] = vector[i];
				}

			}
			if(cont==0) {
				aux[vector.length]=tarea;
			}
		}
		vector = aux;

	}

	public int cantidad() {
		return vector.length;
	}

	public Tarea[] consultar(Fecha fecha) {
		int repetidos = 0, in = 0;
		for (int i = 0; i < vector.length; i++) {
			if (fecha.equals(vector[i].getFecha())) {
				repetidos++;
			}
		}
		Tarea[] vector2 = new Tarea[repetidos];
		for (int j = 0; j < vector.length; j++) {
			if (fecha.equals(vector[j].getFecha())) {
				vector2[in] = vector[j];
				in++;
			}
		}
		return vector2;
	}

	public void borrarPasadas(Fecha fecha) {
		int cont = 0;
		for (int i = 0; i < vector.length; i++) {
			if (fecha.compareTo(this.vector[i].getFecha()) > 0) {
				cont++;
			}
		}
		Tarea[] corto = new Tarea[vector.length - cont];
		for (int i = cont; i < vector.length; i++) {
			corto[i - cont] = vector[i];
		}
		vector = corto;
	}

	public void borrar() {
		Fecha hoy = Fecha.hoy();
		borrarPasadas(hoy);
	}

	public String toString() {
		String hola = "";
		for (int i = 0; i < vector.length; i++) {
			hola += vector[i].toString() + "\n";
		}
		return hola;
	}
}
