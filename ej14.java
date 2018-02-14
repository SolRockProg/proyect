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
		int[] ector = {5,4,2,9,6,7,1};
		System.out.println(últimaPosición(ector,6));
		System.out.println(últimaPosición(ector,3));
	}
	
}
