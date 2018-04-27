package prac3;


public class ListaCadenasEnlaceSimple implements ListaCadenas{
	private static class Nodo{
		String dato;
		Nodo sig;
		
		Nodo (String dato, Nodo sig){
			this.dato=dato;
			this.sig=sig;		
		}
	}
	private Nodo primero;
	private int talla;
	
	public boolean add(String s) {
		if (isEmpty()) {
			primero=new Nodo(s,null);
			talla++;
		}
		else {
			Nodo aux;
			for (aux=primero;aux.sig!=null;aux=aux.sig);
			aux.sig = new Nodo (s,null);
			talla++;
		}
		return true;
	}
	
	public void add(int i,String s) throws IndexOutOfBoundsException{
		if (i<0||i>size()) {
			throw new IndexOutOfBoundsException();
		}
		if (isEmpty()) {
			primero = new Nodo(s,null);
		}
		else {
			Nodo nuevo = primero;
			if (i==0) {
				primero = new Nodo (s,primero);
			}
			else {
				for (int x=1;x<i;x++) {
					nuevo=nuevo.sig;
				}
				nuevo.sig=new Nodo(s,nuevo.sig);
			}
		}
		talla++;
	}
	
	public void clear() {
		primero = null;
		talla = 0;
	}
	
	public String get(int i) throws IndexOutOfBoundsException {
		if (i<0||i>size()) {
			throw new IndexOutOfBoundsException();
		}
		Nodo correcto = primero;
		for (int p=0;p<=i;p++) {
			correcto = correcto.sig;
		}
		return correcto.dato;
	}
	
	public int indexOf(String s) {
		Nodo correcto = primero;
		for (int i=0;i<size();i++) {
			if (s.equals(correcto.dato)) {
				return i;
			}
			correcto=correcto.sig;
		}
		return -1;
	}
	
	public int lastIndexOf(String s) {
		Nodo comodín = primero;
		Nodo correcto = null;
		int índice=0;
		
		for (int i=0;i<size();i++) {
			if (s.equals(comodín.dato)) {
				correcto=comodín;
				índice = i;
			}
			comodín=comodín.sig;
		}
		if (correcto!=null) {
			return índice;
		}
		else {
			return -1;
		}
		
	}
	
	public boolean isEmpty() {
		if (talla==0) {
			return true;
		}
		else return false;
	}
	
	public String remove (int i) throws IndexOutOfBoundsException {
		if (i<0||i>size()) {
			throw new IndexOutOfBoundsException();
		}
		Nodo este = primero;
		for (int x = 1;x<i;x++) {
			este=este.sig;
		}
		String cad = este.sig.dato;
		este.sig=este.sig.sig;
		talla--;
		return cad;
	}
	
	public boolean remove (String s) {
		Nodo nuevo = primero;
		if (nuevo.dato.equals(s)) {
			primero=primero.sig;
			talla--;
			return true;
		}
		while (nuevo != null) {
			if (nuevo.sig.dato.equals(s)) {
				nuevo.sig=nuevo.sig.sig;
				return true;
			}
		}
		return false;
	}
	
	public String set(int i, String s) throws IndexOutOfBoundsException {
		if (i<0||i>size()) {
			throw new IndexOutOfBoundsException();
		}
		Nodo nuevo = primero;
		for (int x=1;x<i;x++) {
			nuevo=nuevo.sig;
		}
		String cad = nuevo.sig.dato;
		Nodo meter=new Nodo(s,nuevo.sig.sig);
		nuevo.sig=meter;
		return cad;
	}
	
	public int size() {
		return this.talla;
	}
	
	public String toString() {
		if (isEmpty()) {
			return "[]";
		}
		String cad="["+primero.dato;
		for (Nodo aux=primero.sig; aux!=null;aux=aux.sig) {
			cad+=", "+aux.dato;
		}
		return cad+"]";
	}

}
