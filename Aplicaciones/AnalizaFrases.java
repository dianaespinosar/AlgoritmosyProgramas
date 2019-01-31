package aplicaciones;

import java.io.File;
import java.util.Scanner;

public class AnalizaFrases {

	public static String leeArchivo (String nom) {
		
		String salida;
		
		try {
			File file = new File(nom);
			Scanner leeArch = new Scanner(file);
			String frase;
			StringBuilder resultado = new StringBuilder();
			
			
			while (leeArch.hasNextLine()) {
				frase = leeArch.nextLine();
				frase = modificaFrase(frase);
				resultado.append(frase).append("\n");
			}
			
			leeArch.close();
			salida = resultado.toString();
		}
		
		catch(Exception e) {
		 salida = "No se puedo abrir.";
		}
		
		return salida.toString();
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
	
	public static void main(String[] args) {
		Scanner lee = new Scanner(System.in);
		String nom, resultado;
		System.out.println("Ingresa nombre del archivo"); 
		nom = lee.nextLine();
		resultado = leeArchivo(nom);
		if (resultado == null) 
			System.out.println("\nError");
		else
			System.out.println("Frases: " + resultado);
	}
}
