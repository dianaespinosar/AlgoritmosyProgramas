package generales;

public class ManejadorCadenas {
	public static StringBuilder genParImp(String cadena) {
		int n, i;
		StringBuilder res = new StringBuilder();
		n = cadena.length();
		for ( i = 0; i < n; i = i + 2) {
			res.append(cadena.charAt(i));
		}
		
		for (i = 1; i < n; i = i + 2) {
			res.append(cadena.charAt(i));
		}
		return res;
	}
	
	public static int cuentaCar(String cadena, char car) {
		int n,count, i;
		n = cadena.length();
		count = 0;
		for (i = 0; i < n; i++) {
			if(cadena.charAt(i) == car) {
				count ++;
			}
		}
		return count;
	}
	
	public static String cambiaPalabra(String cadena, String palabra, String nuePal) {
		cadena = cadena.replace(palabra, nuePal);
		return cadena;
	}
	
	public static String modificaFrase (String frase) {
		int i, n, j;
		String palabra;
		StringBuilder resultado = new StringBuilder();
		
		n = frase.length();
		i = 1;
		while (i < n) {
			if (frase.charAt(i) >= 'A' && frase.charAt(i) <= 'Z') {
				j = i + 1;
				while (j < n && frase.charAt(j) != ' ') {
					j++;
				}	
				palabra = frase.substring(i, j);
				palabra = palabra.toUpperCase();
				resultado.append(frase.substring(0,i)).append(palabra);
				frase = frase.substring(j);
				i = 0;
				n = n - j;
			}
			
			else
				i++;
			}
			
		resultado.append(frase);
			
		return resultado.toString();
	}
}
