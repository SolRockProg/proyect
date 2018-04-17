package Prac2;
import java.*;
import java.util.*;
public class Fecha {
	private int día;
	private int mes;
	private int año;
	
	public Fecha (int día, int mes, int año) {
		this.día=día;
		this.mes=mes;
		this.año=año;
	}
	
	public Fecha (Fecha otraFecha) {
		this.día = otraFecha.día;
		this.mes = otraFecha.mes;
		this.año = otraFecha.año;
	}
	
	public String toString() {
		return día+"/"+mes+"/"+año;
	}
	
	public boolean equals (Object otroObjeto) {
		if (!(otroObjeto instanceof Fecha))
			return false;
		if (otroObjeto==this)
			return true;
		Fecha Aux = (Fecha)otroObjeto;
		return Aux.día==this.día && Aux.mes==this.mes && Aux.año==this.año;
	}
	
	public int compareTo (Fecha otraFecha) {
		int res = (año*10000+mes*100+día) - (otraFecha.año*10000+otraFecha.mes*100+otraFecha.día);
		if (res>0)
			return 1;
		if (res<0)
			return -1;
		return 0;
	}
	
	public int getDía() {
		return this.día;
	}
	
	public int getMes() {
		return this.mes;
	}
	
	public int getAño() {
		return this.año;
	}
	
	public static boolean añoBisiesto(int año) {
		return (año%4==0 && (año%100!=0 || año%400==0 ));
	}
	
	public static int díasMes(int mes, int año) {
		if (mes==2) {
			if (añoBisiesto(año))
				return 29;
			else
				return 28;
		}
		if ( (mes<8 && mes%2==1) || (mes>=8 && mes%2==0) )
			return 31;
		return 30;
	}
	
	public static Fecha hoy() {
		
		Calendar calendario = Calendar.getInstance();
		int día = calendario.get(Calendar.DAY_OF_MONTH); 
		int mes = calendario.get(Calendar.MONTH) + 1; 
		int año = calendario.get(Calendar.YEAR);
		
		Fecha Estamos_a = new Fecha(día,mes,año);
		return Estamos_a;
	}
	
	public Fecha díaSiguiente() {
		Fecha mañana = new Fecha(this.día+1,this.mes,this.año);
		
		if (( mes<8 && mes%2==1 || mes>=8 && mes%2==0) && día==31) {
			mañana.día=1;
			mañana.mes++;
		}
		
		if ((mes<8 && mes%2==0 || mes>=8 && mes%2==1) && día==30) {
			mañana.día=1;
			mañana.mes++;
		}
		
		if (añoBisiesto(año)) {
			if (mes==2 && día==29) {
				mañana.día=1;
				mañana.mes=3;
			}
		}
		else {
			if (mes==2 && día==29) {
				mañana.día=1;
				mañana.mes=3;
			}
		}
		
		if (mañana.mes==13) {
			mañana.año++;
			mañana.mes=1;
		}
		
		return mañana;
	}
	
	public static void main(String[] args) {
		Fecha cumple = new Fecha (3,2,1999);
		Fecha ejemplo = new Fecha (31,12,1999);
		System.out.println(ejemplo.toString());
		System.out.println(ejemplo.díaSiguiente().toString());
		System.out.println(cumple.díaSiguiente().toString());
		System.out.println(ejemplo.hoy().toString());
	}
}
