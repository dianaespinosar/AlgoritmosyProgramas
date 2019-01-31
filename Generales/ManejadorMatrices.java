/*Elisa Espinosa
 * Manejador de Matrices
 *29/10/2018
 */
public class ManejadorMatrices {

	public static double suma(double[][] matriz, int m, int n) {
		int suma = 0;

		for( int i= 0; i<m; i++) {
			for(int j=0;  j<n;j++) {
				suma+= matriz[i][j];
			}
		}
		return suma;
	}

	public static double sumaRen(double[][] matriz, int m, int n) {
		int suma = 0;

		for( int i= 0; i<n; i++) {
			suma+= matriz[m][i];
		}

		return suma;
	}

	public static double sumaCol(double[][] matriz, int m, int n) {
		int suma = 0;

		for( int i= 0; i<m; i++) {
			suma+= matriz[i][n];
		}

		return suma;
	}

	public static double sumaDiag(double[][] matriz, int m) {
		int suma = 0;

		for( int i=0; i <m; i++) {
			suma+= matriz[i][i];
		}
		return suma;
	}
	public static double sumaDiagInver(double[][] matriz, int m) {
		int suma = 0;
		int j = 0;
		for( int i=m; i >m; i--) {
			suma+= matriz[i][j];
			j++;
		}
		return suma;
	}

	public static int mayRen(double[][] matriz, int ren, int col) {
		double may = matriz[ren][0];
		int posma = 0;

		for ( int i = 1; i < col; i++) {
			if (matriz[ren][i] > may) {
				may = matriz[ren][i];
				posma = i;
			}
		}
		return posma;
	}

	public static int menRen(double[][] matriz, int ren, int col) {
		double men = matriz[ren][0];
		int posmen = 0;

		for ( int i = 1; i < col; i++) {
			if (matriz[ren][i] < men) {
				men = matriz[ren][i];
				posmen = i;
			}
		}
		return posmen;
	}
//Función que me da la posición del mayor en la columna
	public static int mayCol(double[][] matriz, int ren, int col) {
		double may = matriz[0][col];
		int posma = 0;

		for ( int i = 1; i < ren; i++) {
			if (matriz[i][col] > may) {
				may = matriz[i][col];
				posma = i;
			}
		}
		return posma;
	}

	public static int menCol(double[][] matriz, int ren, int col) {
		double men = matriz[0][col];
		int posmen = 0;

		for ( int i = 1; i < ren; i++) {
			if (matriz[i][col] < men) {
				men = matriz[i][col];
				posmen = i;
			}
		}
		return posmen;
	}

	public static int [] posMenor(double [][] matriz, int ren, int col) {
		double men = matriz[0][0];
		int posmenren = 0;
		int posmencol = 0;
		int [] posMen = new int [2];

		for ( int i = 1; i < ren; i++) {
			for ( int j = 1; j < col; j++) {
				if (matriz[i][j] < men) {
					men = matriz[i][j];
					posmenren = i;
					posmencol = j;
				}
			}
		}
		posMen[0] = posmenren;
		posMen[1] = posmencol;

		return posMen;
	}

	public static int [] posMayor(double [][] matriz, int ren, int col) {
		double may = matriz[0][0];
		int posmaren = 0;
		int posmacol = 0;
		int [] posMay = new int [2];

		for ( int i = 1; i < ren; i++) {
			for ( int j = 1; j < col; j++) {
				if (matriz[i][j] > may) {
					may = matriz[i][j];
					posmaren = i;
					posmacol = j;
				}
			}
		}
		posMay[0] = posmaren;
		posMay[1] = posmacol;

		return posMay;
	}

	public static boolean esIdentidad(double [][] matriz, int n) {
		boolean res = false;
		int i = 0;
		int j = 0;
		int  y = 0;

		while (i<n && matriz [i][i] != 0) {
			j = i+1;
			while (j < n && matriz[i][j] == 0) {
				y = 0;
				while (y < i && matriz [i][i-y] == 0) {
					y++;
				}
				j++;
			}
			i++;
		}
		if ( i == n && j == n && y == i)
			res = true;
		return res;
	}

	public static boolean esSimetrica(double [][] matriz, int n) {
		boolean res = false;
		int i = 0;
		int j = 0;
		
		while ( i < n-1) {
			 j = i+1;
			while ( j < n && matriz [i][j] == matriz [j][i]) {
				j++;
			}
			i++;
		}
		if ( i == n-1 && j == n)
			res = true;
		return res;	
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
	public static double [][] traspuesta(double [][] matriz, int n){
		double x;
		for(int i = 0; i<n;i++) {
			for( int j = 0; j < i; j++) {
				x = matriz[i][j];
				matriz[i][j] = matriz[j][i];
				matriz[j][i] = x;
			}
		}
	return matriz;	
	}
}

