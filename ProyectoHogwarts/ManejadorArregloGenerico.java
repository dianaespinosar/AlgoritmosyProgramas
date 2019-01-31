//Diana Espinosa Ruiz
//Matrícula 000179164
//Proyecto Colegio Hogwarts de Magia y Hechicería

package generales;

public class ManejadorArregloGenerico {
	public static <T> int buscaSecuencial(T []array, int total,  T dato) {
		int i = 0;		
		while (i < total && !array[i].equals(dato)) {
			i++;
		}
		
		if (i == total) 
			i = -1;
		
		return i;
		
	}
	
	public static <T extends Comparable <T>> int buscaBin(T[] array, int total, T dato) {
		
		int izq, der, cen;
		izq = 0;
		der = total - 1;
		cen = der / 2;
		while(izq <= der && !dato.equals(array[cen])) {
			if(array[cen].compareTo(dato) > 0) {
				der = cen - 1;
				System.out.println(cen);
				System.out.println(array[cen].compareTo(dato));
			}
			else 
				izq = cen + 1;
			cen = (izq + der) / 2;
		}
		
		if (izq > der)
			cen = (izq + 1) * -1;
		
		return cen;
		
	}
	
	public static  <T extends Comparable <T>> int insertaOrdena(T[] array, int total, T dato) {
		if (total < array.length) {
			int pos = buscaBin(array, total, dato);
			if(pos < 0) {
				pos = (pos * -1) - 1;
				recorreDer(array, total, pos);
				array[pos] = dato;
				total++;
			}
		}
		
		return total;
			
	}
	
	public static <T> void recorreDer(T[] array, int total, int pos) {
		for (int i = total; i > pos; i-- )
			array[i] = array[i - 1];
	}
	
	public static  <T extends Comparable <T>> int eliminaOrdena(T[] array, int total, T dato) {
		int pos = buscaBin(array, total, dato);
		if(pos >= 0) {
			total--;
			recorreIzq(array, total, pos);
			
			array[total] = null;
		}
		
		return total;
			
	}
	
	public static <T> void recorreIzq(T[] array, int total, int pos) {
		for (int i = pos; i < total; i++ )
			array[i] = array[i + 1];
	}
	
	public static  <T extends Comparable <T>> void ordenaSelDir (T[] array, int total) {
		int i, j, pos;
		T menor;
		for (i = 0; i < total - 1; i++) {
			menor = array[i];
			pos = i;
			for (j= i + 1; j < total; j++) {
				if(menor.compareTo(array[j]) > 0) {
					menor = array[j];
					pos = j;
				}
			}
			
			array[pos] = array[i];
			array[i] = menor;
			
		}
	}
	
	public static  <T> String imprimeArray (T[] array, int total) {
		StringBuilder res = new StringBuilder();
		for (int i = 0 ; i < total; i++)
			res.append(array[i]).append("\n");
		
		return res.toString();
	}
	
	public static <T> int[] encuentraPosicion(T [][] matriz, int tRen, int tCol,  T dato, int[]totales) {
		boolean buscar = false;
		int [] posicion = new int[2];
		posicion[0] = -1;
		posicion[1] = -1;
		if (matriz != null && tRen > 0 && tRen <= matriz.length && tCol > 0 && tCol <= matriz[0].length && totales.length <= tRen) {
			int i = 0;
			int j;
			
			while (i < tRen && !buscar ) {
				j = 0;
				while (j < totales[i] && !buscar) {
					if (matriz[i][j].equals(dato)) {
						buscar = true;
						posicion[0] = i;
						posicion[1] = j;
					}
					j++;
				}
				i++;
			}
		}
		
		return posicion;		
		
	}
	
}
