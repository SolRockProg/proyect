package prac1;

public class ej25 {
	public static String másVictoriasFuera (char[][] tabla, String[] equipos) {
		int equipo=-1;
		int victorias=-1;
		for (int i=0;i<equipos.length;i++) {
			int cont=0;
			for (int j=0;j<equipos.length;j++) {
				if (tabla[j][i]=='2')
					cont++;
			if (cont>victorias) {
				victorias=cont;
				equipo=i;
			}
			}
		
		}
		return equipos[equipo];
	}
	public static void main(String[] args) {
		char[][] matriz = {{'-','1','2','1'},{'2','-','2','1'},{'1','-','-','2'},{'1','1','2','-'}};
		String[] vector = {"toni","pedro","juan","andrés"};
		System.out.println(másVictoriasFuera(matriz,vector));
	}

}
