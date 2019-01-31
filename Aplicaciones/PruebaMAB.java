package aplicaciones;

import java.util.Scanner;

import generales.ManejadorArregloBidimensional;

public class PruebaMAB {

	public static void main(String[] args) {
		/*double [][] cal = new double [30][6];
		int tA, tE;
		*/
		
		
		double [][] matriz;
		matriz =  new double[4][4];
		int k = 1;
		for( int i =0; i<4; i++) 
			for(int j = 0; j< 4; j++) {
				matriz[i][j] = k;
				k++;
			}
		
		System.out.println(ManejadorArregloBidimensional.imprimirMatriz(matriz, 4, 4));
	
		
		/*Scanner lee = new Scanner(System.in);
		
		do {
			System.out.println("Total de alumnos");
			tA = lee.nextInt();
		} while (tA < 1 || tA > 30);
		
		do {
			System.out.println("Total de exámenes");
			tE = lee.nextInt();
		} while (tE < 1 || tE > 6);
		
		ManejadorArregloBidimensional.leeMat(cal, tA, tE, lee);
		
		for (int i = 0; i < tE; i++) 
			System.out.println("Promedio de alumno " +  ManejadorArregloBidimensional.sumaCol(cal, tA, i) / tA);
		
		for (int i = 0; i < tA; i++) 
			System.out.println("Promedio de examen " +  ManejadorArregloBidimensional.sumaRen(cal, tE, i) / tE);
	}
	*/
	}	
}
