package aplicaciones;

import java.io.File;
import java.util.*;

public class Palindromo {

	public static String leeArch(String nomArch) {
		String salida;
		try {
			File file = new File(nomArch);
			Scanner leeArch = new Scanner(file);
			String frase;
			StringBuilder resultado = new StringBuilder();
			
			while(leeArch.hasNextLine()) {
				frase = leeArch.nextLine();
				resultado.append(frase).append(" ");
				frase = pegar(frase);
				resultado.append(frase).append("\n");
			}
			
			leeArch.close();
			salida = resultado.toString();
		}
		
		catch(Exception e) {
			salida = null;
		}
		
		return salida;
	}
	
	public static String pegar(String frase) {
		StringBuilder res = new StringBuilder();
		StringBuilder mirror = new StringBuilder();
		String pali;
		boolean ans;
		int i, n;
		n = frase.length();
		for (i = 0; i < n; i++) {
			if (frase.charAt(i) >= 'A' & frase.charAt(i) <= 'z' || frase.charAt(i) >= '0' & frase.charAt(i) <= '9') {
				res.append(frase.charAt(i));
				mirror.insert(0,frase.charAt(i));
			}
		
		}	
		if (mirror.toString().equalsIgnoreCase(res.toString())) {
			pali = "Palindromo";
		}
		else
			pali = "No palindromo";
					
		return pali;
	}	
		
	
	public static void main(String[] args) {
		Scanner lee = new Scanner(System.in);
		String nomArch, cambio;
		System.out.println("Dame nombre del archivo");
		nomArch = lee.nextLine();
		cambio = leeArch(nomArch);
		if (cambio == null) {
			System.out.println("Error");
		}
		else
			System.out.println(cambio);
	}
}
