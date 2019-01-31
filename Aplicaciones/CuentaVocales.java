package aplicaciones;
import java.io.File;

import java.util.*;
public class CuentaVocales {

	
	
	public static int[] cuentaVoc(String nomArch) {
		int [] totales = {0,0,0,0,0} ;
		
		try {
			File file = new File (nomArch);
			Scanner leeArch = new Scanner(file);
			int n;
			String frase;
			
			while (leeArch.hasNextLine()) {
				frase = leeArch.nextLine();
				n = frase.length();
				for (int i = 0; i < n; i++) {
					switch (frase.charAt(i)) {
					case 'a':
					case 'A': totales[0] ++;
					break;
					case 'e':
					case 'E': totales [1] ++;
					break;
					case 'i':
					case 'I': totales[2] ++;
					break;
					case 'o':
					case 'O': totales [3] ++;
					break;
					case 'u':
					case 'U': totales [4] ++;
					break;
					}
				}
			}
			leeArch.close();
			
			
		}
		
		catch (Exception e) {
			
			
		}
		
		return totales;
		
	}
	
	public static void main(String[] args) {
		String nomArch;
		Scanner lee = new Scanner(System.in);
		
		int [] count = new int[5];
		char[] vocales = {'a', 'e', 'i', 'o', 'u'} ;
		
		System.out.println("Ingresa nombre del archivo");
		nomArch = lee.nextLine();
		count = cuentaVoc(nomArch);
		for (int i = 0; i < 5; i++) {
			System.out.println(vocales[i] + " aparece " + count[i] + " veces.");
		}
		
	}

}
