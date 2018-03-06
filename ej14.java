package prac1;
import java.util.*;
public class ej14 {

	public static int últimaPosición(int[] v,int n) {
		for (int i=v.length-1;i>=0;i--)
			if (v[i]==n)
				return i;
		return (-1);	
	}
	
	public static void main (String args[]) {
		int[] vector1 = {5,4,2,9,6,7,1};
		int[] vector2 = {5,4,2,5,4,9,7,5,4,8,8,8,5};
		System.out.print("últimaPosición 6 en {5,4,2,9,6,7,1}: ");
		System.out.println(últimaPosición(vector1,6));
		System.out.print("en {5,4,2,9,6,7,1}: ");
		System.out.println(últimaPosición(vector1,3));
		System.out.print("en {5,4,2,5,4,9,7,5,4,8,8,8,5}: ");
		System.out.println(últimaPosición(vector2,5));
		System.out.print(" en {5,4,2,5,4,9,7,5,4,8,8,8,5}: ");
		System.out.println(últimaPosición(vector2,8));
	}
	
}
