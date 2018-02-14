package prac1;

import java.util.Arrays;

public class ej18 {
	public static int[] eliminarPosición (int[] vector, int n){
		if (n<0||n>=vector.length)
			return vector;
		int[] nuevo = new int[vector.length-1];
		int x=0;
		for (int i=0;i<vector.length;i++) {
			if (i==n)
				i++;
			nuevo[x]=vector[i];
			x++;
		}
		return nuevo;
		
	}
	public static void main(String[] args) {
		int[] nums= {5,4,2,9,6,7,1};
		System.out.println(Arrays.toString(eliminarPosición(nums,4)));
		System.out.println(Arrays.toString(eliminarPosición(nums,1)));
		System.out.println(Arrays.toString(eliminarPosición(nums,9)));
	}

}
