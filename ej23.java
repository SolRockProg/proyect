
public class ej23 {
	public static boolean est·EnTodasLasColumnas(int[][] matriz, int n) {
		for(int i=0; i<matriz[1].length;i++) {
			int cont=0;
			for(int x=0; x<matriz.length; x++) {
				if (matriz[x][i]!=n) 
					cont++;
				if (cont==matriz.length) {
					return false;
				
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[][] matriz= {{1,2,3},{1,2,2}};
		System.out.print(est·EnTodasLasColumnas(matriz, 2));
	}

}
