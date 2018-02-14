import java.util.*;
import java.io.*;
public class ej26 {
	public static int obtenerPuntos(String[][] matriz, String[] equipos, String nomeq) {
		int eq = 0;
		for (int i = 0; i < equipos.length; i++) {
			if (equipos[i] == nomeq)
				eq = i;
		}
		int puntos=0;
		for (int t=0; t<matriz.length; t++){
			switch(matriz[eq][t]){
			case "1":
				puntos+=3;
				break;
			case "X": 
				puntos+=1;
				break;
				
			}
			switch(matriz[t][eq]){
			case"2":
				puntos+=3;
				break;
			case"X":
				puntos+=1;
				break;
			}
		}
		return puntos;
	}

	public static void main(String[] args) throws FileNotFoundException{
		String[] vector = {"vicente","culo_caliente","sanguich","arriba_yugoslavia"};
		String[][] matriz= {{"-","2","1", "1"}, {"1", "-", "1", "1"}, {"1", "2","-","1"}, {"1", "2","1", "-"}};
			System.out.println(obtenerPuntos(matriz, vector,"arriba_yugoslavia" ));
		}
	
	}
	


