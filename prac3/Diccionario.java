package prac3;

import java.util.*;

public class Diccionario {
	private static class Nodo {
		String cadena;
		int cantidad;
		Nodo sig, ant;

		Nodo(String cadena, int cantidad, Nodo sig, Nodo ant) {
			this.cadena = cadena;
			this.cantidad = cantidad;
			this.sig = sig;
			this.ant = ant;
		}

		public String toString() {
			return this.cadena + "-->" + this.cantidad;
		}
	}

	private Nodo primero, ultimo;

	public void añadir(String unaCadena, int unaCantidad) {
		Nodo aux = primero;
		boolean hola = false;
		if (primero == null) {
			ultimo = primero = new Nodo(unaCadena, unaCantidad, null, null);
		} else {
			while (aux != null) {
				if (unaCadena.equals(aux.cadena)) {
					aux.cantidad = aux.cantidad + unaCantidad;
					hola = true;
				} else {
					if (unaCadena.compareTo(aux.cadena) > 0) {
						Nodo nuevo = new Nodo(unaCadena, unaCantidad, aux, aux.ant);
						hola = true;
					}
				}
				aux = aux.sig;
			}
			if (!hola) {
				Nodo nuevo = new Nodo(unaCadena, unaCantidad, null, ultimo);
				ultimo = ultimo.sig;
			}
		}

	}

	public String cadenaConMayorCantidad() {
		if (primero == null) {
			return null;
		}
		Nodo aux = primero;
		int max = 0;
		String cad = "";
		while (aux != null) {
			if (max < aux.cantidad) {
				cad = aux.cadena;
			}
			aux = aux.sig;
		}
		return cad;
	}

	public int cantidad(String unaCadena) {
		Nodo aux = primero;
		while (aux != null) {
			if (unaCadena.equals(aux.cadena)) {
				return aux.cantidad;
			}
			aux = aux.sig;
		}
		return 0;
	}

	public String toString() {
		Nodo aux = primero;
		String cad = "{";
		while (aux != null) {
			if (aux != ultimo) {
				cad += aux.toString() + ", ";
			} else {
				cad += aux.toString() + "}";
			}
		}
		return cad;
	}
}
