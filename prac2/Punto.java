package prac2;

public class Punto {
		private double x;
		private double y;
		
		public Punto (double x, double y) {
			this.x = x;
			this.y = y;
		}
		
		public Punto() {
			this.x = 0;
			this.y = 0;
		}
		
		public double getX() {
			return x;
		}
		public double getY() {
			return y;
		}
		
		public Punto desplazar(double desplazamientoX, double desplazamientoY) {
			Punto otro = new Punto (this.x+desplazamientoX, this.y+desplazamientoY);
			return otro;
		}
		
		public double distancia(Punto otroPunto) {
			return (Math.sqrt(Math.pow(this.x-otroPunto.x,2)+Math.pow(this.y-otroPunto.y,2)));
		}
		
		public String toString() {
			return "("+x+", "+y+")";
		}
		
		public boolean equals (Object otroObjeto) {
			if (otroObjeto==this)
				return true;
			if (!(otroObjeto instanceof Punto)) {
				return false;
			}
			Punto otro = (Punto)otroObjeto;
			return this.x==otro.x && this.y==otro.y;
			
		}
		
		public static void main (String args[]) {
			Punto a = new Punto(3,5);
			Punto b = a.desplazar(7, 3);
			System.out.println(a);
			System.out.println(b);
			System.out.println(a.distancia(b));
			System.out.println(b.getX());
		}
		
}
