package generales;

public class ManejadorArreglo {
	public static double sumaArreglo(double []array, int n) {
		int i;
		double suma = 0;
		for(i = 0; i < n; i++) {
			suma = suma + array[i];
		}
		return suma;
	}
	
	public static double promArreglo(double []array, int n) {
		double prom;
		if (n > 0)
			return sumaArreglo(array, n)/ n;
		else
			return 0;
	}
	
	public static int maxValor(double []array, int n) {
		int i,j = 0;
		double maxValor = Integer.MIN_VALUE;
		if (n == 0) 
			j = -1;
		else {
			for (i = 0; i < n; i++) {
				if (maxValor < array[i]) {
					maxValor =  array[i];
					j = i + 1;	
				}
			}
		}
		return j;
	}
	
	public static int buscaSecuencial(double []array, int total,  double dato) {
		int i;
		for (i = 0; i < total && array[i] != dato; i++);
		
		if (i == total) 
			i = -1;
		
		return i;
		
	}
	public static int insetaDesord (double[]array, int total, double dato) {
		if (total < array.length) {
			array[total] = dato;
			total++;
		}
		return total;
		
	}

	public static int eliminarDesord(double []array, int total, double dato) {   //eleminar del arreglo
		int pos;
		pos = ManejadorArreglo.buscaSecuencial(array, total, dato);
		if (pos >= 0 ) {
			array[pos] = array[total - 1];
			total --;
		}
		return total;
	}
	
	public static String infoArray(double [] array, int total) {
		StringBuilder res = new StringBuilder();
		
		for (int i = 0; i < total; i++) 
			res.append(array[i]).append("\n");
		return res.toString();
	}
	public static int buscarSecuenciaOrden(double []array, int total, double dato) {
		int i = 0 ;
		while ( i< total && array[i] < dato) {
			i++;
		}
		if (i == total || array[i] > dato)
			i = (i + 1) * -1;
		
		return i;
	}
	public static int eliminarOrd(double []array, int total, double dato) {   //eleminar del arreglo
		int pos;
		pos = ManejadorArreglo.buscarSecuenciaOrden(array, total, dato);
		if (pos >= 0) {
			recorreIzq(array, total, pos);
			total --;
		}
		return total;
	}
	
	public static void recorreIzq(double []array, int total, int pos) {
		for (int i = pos; i < total; i++) {
			array[i] = array[i+1];
		}
	}
	
	public static int insertaOrd (double []array, int total, double dato) {
		int pos;
		if (total < array.length) { //hay espacio
			pos = ManejadorArreglo.buscarSecuenciaOrden(array, total, dato);
			if (pos < 0) {
				pos = pos * -1 - 1;
				recorreDer (array, total, pos);
				array[pos] = dato;
				total ++;
			}
		}
		return total;
	}
	
	public static void recorreDer(double []array, int total, int pos) {
		for (int i = total; i > pos; i--) 
			array [i] = array [i - 1] ;
		
	}
	
	public static int buscaSecuencialString(String []array, int total,  String dato) {
		int i;
		for (i = 0; i < total && !array[i].equals(dato); i++);
		
		if (i == total) 
			i = -1;
		
		return i;
		
	}
}
