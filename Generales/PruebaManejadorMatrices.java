/*Elisa Espinosa Ruiz
 * Prueba manejador matrices
 * 1/11/2018
 */
public class PruebaManejadorMatrices {

	public static void main(String[] args) {
		
		double [][] matriz;
		double [][] matriz2;
		double [][] sumamat;
		double k;
		double h;
		int[] arrposmay, arrposmen;
		matriz =  new double[4][4];
		matriz2 = new double [4][4];
		k =1;
		h=0;
		for( int i =0; i<4; i++)
			for(int j = 0; j< 4; j++) {
				matriz[i][j] = k;
				matriz2 [i][j]=h;
				h++;
				k++;
			}
		
		for( int i= 0; i<4; i++) {
			for(int j=0;  j<4;j++) {
				System.out.print(matriz[i][j] + "  ");
			}
			System.out.println(" ");
		}
		
		System.out.println("Suma total " + ManejadorMatrices.suma(matriz, 4,4));
		System.out.println("Identidad " +ManejadorMatrices.esIdentidad(matriz, 4));
		System.out.println("Es simétrica " +ManejadorMatrices.esSimetrica(matriz, 4));
		System.out.println("May Col " + ManejadorMatrices.mayCol(matriz, 4, 3));
		System.out.println("May Ren " +ManejadorMatrices.mayRen(matriz, 0, 4));
		System.out.println("Men Col " +ManejadorMatrices.menCol(matriz, 4, 3));
		System.out.println("Men Ren " +ManejadorMatrices.menRen(matriz, 0, 4));
		System.out.println("Suma Col " +ManejadorMatrices.sumaCol(matriz, 4, 0));
		System.out.println("Suma Ren " +ManejadorMatrices.sumaRen(matriz, 0,4));
		System.out.println("Suma Diag " +ManejadorMatrices.sumaDiag(matriz, 4));
		System.out.println("Suma Diag Inv " +ManejadorMatrices.sumaDiagInver(matriz, 4));
		System.out.println("Pos May ");
		arrposmay = ManejadorMatrices.posMayor(matriz, 4, 4);
		for (int i = 0; i < arrposmay.length; i++) {
			System.out.print("["+ arrposmay[i]+ "]");
		}
		
		arrposmen = ManejadorMatrices.posMenor(matriz, 4, 4);
		System.out.println("\nPos men ");
		for (int i = 0; i < arrposmen.length; i++) {
			System.out.print("["+ arrposmen[i]+ "]");
		}
		
		sumamat = ManejadorMatrices.sumaAyB(matriz, 4, 4, matriz2, 4, 4);
		
		System.out.println("\nSuma de matrices");
		for( int i= 0; i<4; i++) {
			for(int j=0;  j<4;j++) {
				System.out.print(sumamat[i][j] + "  ");
			}
			System.out.println(" ");
		}
		ManejadorMatrices.traspuesta(matriz, 4);
		System.out.println("Matriz Traspuesta");
		for( int i= 0; i<4; i++) {
			for(int j=0;  j<4;j++) {
				System.out.print(matriz[i][j] + "  ");
			}
			System.out.println(" ");
		}
	}

}
