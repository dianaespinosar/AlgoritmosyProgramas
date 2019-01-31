package aplicaciones;

import java.util.ArrayList;

public class PracticaArreglos {
	public static ArrayList <Integer> encuentraParesImpares (int []aP, int []aI) {
		ArrayList <Integer> paresImpares = new ArrayList();
		int i;
		for (i = 0; i < aP.length; i++) {
			if (aP[i] %2 == 0) 
				paresImpares.add(aP[i]);
		}
		
		for (i = 0; i < aI.length; i++) {
			if (aI[i] %2 == 1) {
				paresImpares.add(aI[i]);
			}
		}
		return paresImpares;
	}
	
	public static void main(String[] args) {
		int [] arre1 = {8,23,15,16,11,4,2};
		int [] arre2 = {6,4,9,7,10,13};
		System.out.println(encuentraParesImpares (arre1, arre2));
	}

}
