package generales;

import java.util.Scanner;

public class ManejadorArregloBidimensional {

	public static double sumaCalif(double [][]mat, int tRen, int col) {
		double suma = 0;
		if (mat != null && tRen > 0 && tRen <= mat.length && col >= 0 && col < mat[0].length) {
			for (int i = 0; i < tRen ; i++) {
				suma += mat[i][col];
			}
			
		}
		
		return suma;
	}
	
	public static double sumaMat(double [][]mat, int tRen, int tCol) {
		double suma = 0;
		if (mat != null && tRen > 0 && tRen <= mat.length && tCol >= 0 && tCol <= mat[0].length) {
			for (int i = 0; i < tRen ; i++) {
				for (int j = 0; j < tCol; j++)
					suma += mat[i][j];
			}
			
		}
		
		return suma;
	}
	
	public static void leeMat(double [][]mat, int tRen, int tCol, Scanner lee) {
		if (mat != null && tRen > 0 && tRen <= mat.length && tCol >= 0 && tCol <= mat[0].length) {
			for (int i = 0; i < tRen ; i++) {
				for (int j = 0; j < tCol; j++)
					mat[i][j] = lee.nextDouble();
			}
			
		}
		
	}
	
	public static double sumaCol(double [][]mat, int tRen, int col) {
		double suma = 0;
		if (mat != null && tRen > 0 && tRen <= mat.length && col >= 0 && col < mat[0].length) {
			for (int i = 0; i < tRen ; i++) {
				suma += mat[i][col];
			}
			
		}
		
		return suma;
	}
	
	public static double sumaRen(double [][]mat, int ren, int tCol) {
		double suma = 0;
		if (mat != null && ren > 0 && ren < mat.length && tCol >= 0 && tCol <= mat[0].length) {
			for (int i = 0; i < tCol  ; i++) {
				suma += mat[ren][i];
			}
			
		}
		
		return suma;
	}
	
	public static double sumaMatDia(double [][]mat, int tRen, int tCol) {
		double suma = 0;
		if (mat != null && tRen > 0 && tRen <= mat.length && tCol >= 0 && tCol <= mat[0].length && tRen == tCol) {
			for (int i = 0; i < tRen ; i++) {
				suma += mat[i][i];
			}
		}
		return suma;
	}
	
	public static double sumaMatDiaOpuesta(double [][]mat, int tRen, int tCol) {
		double suma = 0;
		if (mat != null && tRen > 0 && tRen <= mat.length && tCol >= 0 && tCol <= mat[0].length && tRen == tCol) {
			for (int i = 0; i < tRen ; i++) {
				suma += mat[i][tCol - 1 -i];
			}
		}
		return suma;
	}
	
	public static String imprimirMatriz(double [][]mat, int tRen, int tCol) {
		StringBuilder matriz = new StringBuilder();
		
		if (mat != null && tRen > 0 && tRen <= mat.length && tCol > 0 && tCol <= mat[0].length) { 
			for(int i = 0; i < tRen; i++) {
				for(int j = 0; j < tCol; j++) {
					matriz.append(mat[i][j]).append(" ");
				}
				matriz.append("\n");
			}
		}
		return matriz.toString();
	}
	
	public static int mayorRen(double[][] matriz, int ren, int tCol) {
		int posma;
		if (matriz != null && ren >= 0 && ren < matriz.length && tCol > 0 && tCol <= matriz[0].length) {
			posma = 0;
			for (int i = 1; i < tCol; i++) {
				if (matriz[ren][i] > matriz[ren][posma]);
					posma = i;
				}
			}
		else 
			posma = -1;
		return posma;
	}
	
	public static int menorRen(double[][] matriz, int ren, int tCol) {
		int posme;
		if (matriz != null && ren >= 0 && ren < matriz.length && tCol > 0 && tCol <= matriz[0].length) {
			posme = 0;
			for (int i = 1; i < tCol; i++) {
				if (matriz[ren][i] < matriz[ren][posme])
					posme = i;
			}
		}
		else
			posme = -1;
		return posme;
	}
	
	public static int menorCol(double[][] matriz, int tRen, int col) {
		
		int posme;
		if (matriz != null && tRen > 0 && tRen < matriz.length && col >= 0 && col < matriz[0].length) {
			posme = 0;
			for (int i = 1; i < tRen; i++) {
				if (matriz[i][col] < matriz[posme][col])
					posme = i;
				
			}
		}
		
		else 
			posme = -1;
		return posme;
	}
	
	public static int mayorCol(double[][] matriz, int tRen, int col) {
		
		int posma;
		if (matriz != null && tRen > 0 && tRen < matriz.length && col >= 0 && col < matriz[0].length) {
			posma = 0;
			for (int i = 1; i < tRen; i++) {
				if (matriz[i][col] > matriz[posma][col]) {
					posma = i;
				}
			}
		}
		
		else 
			posma = -1;
		
		return posma;
		
	}
	
	public static double [][] sumaAyB(double [][] matriz1, int ren1, int col1, double [][] matriz2, int ren2, int col2 ){
		double [][] suma = new double [ren1][col1];
		double sum;
		
		if ( ren1 == ren2 && col1 == col2) {
			for ( int i = 0; i < ren1; i++) {
				for ( int j = 0; j < col1; j++) {
					sum = matriz1[i][j] + matriz2[i][j];
					suma [i][j] = sum;
				}
			}
		}
		return suma;
	}
}
