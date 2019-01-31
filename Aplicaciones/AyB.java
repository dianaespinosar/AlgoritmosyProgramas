package aplicaciones;
import java.io.File;
import java.util.*;
public class AyB {

	public static String leeArch(String nomArch) {
		String salida;
		try {
			File file = new File(nomArch);
			Scanner leeArch = new Scanner(file);
			String frase;
			StringBuilder resultado = new StringBuilder();
			
			while(leeArch.hasNextLine()) {
				frase = leeArch.nextLine();
				frase = decofi(frase);
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
	
	public static String decofi(String frase) {
		StringBuilder res = new StringBuilder();
		int i,vec, j;
		int n = frase.length();
		for(i = 0; i < n; i+=2) {
			if(frase.charAt(i) >= '1' && frase.charAt(i) <= '9') {
				vec = frase.charAt(i) - '0';
				for(j = 0; j < vec; j++) {
					res.append(frase.charAt(i+1));
				}
				
			}
		
		}
		return res.toString();
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
