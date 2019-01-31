package generales;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ArregloDato {
	
	public static ArrayList datosPosiciones (double [] array, int x) {
		ArrayList res = new ArrayList();
		int n = array.length;
		for (int i = 0; i < n; i+=x ) {
			res.add(array[i]);
		}
		
		return res;
	}
	
	
	public static void main(String[] args) {
		try {
			File file = new File ("Datos.txt");
			Scanner lee = new Scanner(file);
			double []array = new double [5];
			int i = 0;
			while (lee.hasNextDouble() && i < array.length) {
				array[i] = lee.nextDouble();
				i++;
			}
			lee.close();
			System.out.println("Nuevo arreglo: " + datosPosiciones(array, 2));
		} catch (Exception e) {
			System.out.println("Error");
		}
		
	}

}
