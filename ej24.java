package prac1;
import java.util.*;
import java.io.*;
public class ej24 {
	
	public static char[][] crearMatrizResultados (String[] equipos, String archivo) throws FileNotFoundException {
		char[][] tabla = new char[equipos.length][equipos.length];
		for (int m=0;m<equipos.length;m++)
			for (int n=0;n<equipos.length;n++)
				tabla[m][n]='-';
		Scanner in = new Scanner (new File(archivo));
		while (in.hasNextLine()) {
			String local = in.next();
			int puntos_local = in.nextInt();
			String visitante = in.next();
			int puntos_visitante = in.nextInt();
			int i=-1;
			int j=-1;
			for (int x=0;x<equipos.length;x++) 
				if (equipos[x].equals(local))
					i=x;
			for (int x=0;x<equipos.length;x++) 
				if (equipos[x].equals(visitante))
					j=x;
			int fin = puntos_local - puntos_visitante;
			if (fin>0)
				tabla[i][j]='1';
			if (fin<0)
				tabla[i][j]='2';
			if (fin==0)
				tabla[i][j]='X';
				}
			
		in.close();
		return tabla;
		}

	public static void main(String[] args) throws FileNotFoundException{
		String[] vector = {"vicente","culo_caliente","sanguich","arriba_yugoslavia","semper","fidelis"};
		String archivo = "datos.txt";
		for (char[] fila: crearMatrizResultados(vector,archivo))
			System.out.println(Arrays.toString(fila));
	
	}

}
