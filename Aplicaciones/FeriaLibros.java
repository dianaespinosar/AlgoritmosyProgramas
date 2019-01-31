package aplicaciones;
import java.util.Scanner;
public class FeriaLibros {

	public static void main(String[] args) {
		Scanner lee = new Scanner(System.in);
		int claveAs, numPag, numLi, promPag;
		int asMinPag = 0;
		int asMax = 0;
		int noLec = 0;
		int numAs = 0;
		int totalPagFe = 0;
		int totalPag = 0; 
		int promFe = 0;
		int minPag = Integer.MAX_VALUE;
		int maxPag = Integer.MIN_VALUE;
		int minPagTo = Integer.MAX_VALUE;
		int maxPagTo = Integer.MIN_VALUE;
		System.out.println("Eres el asistente: " ); 
		claveAs = lee.nextInt();
		
		while (claveAs != -1) {
			System.out.println("¿Cuántos libros leíste?"); 
			numLi = lee.nextInt();
			if (numLi == 0) {
				noLec ++;
			}
			
			else {
				totalPag = 0;
				for (int i = 0; i < numLi; i++) {
					System.out.println("¿Cuántas páginas por libro?" ); 
					numPag = lee.nextInt();
					totalPag = totalPag + numPag;
					minPag = Math.min(minPag, numPag);
					
				}
				
				promPag = totalPag / numLi;
				System.out.println("El asistente " + claveAs + " leyó un promedio de " + promPag + " por libro." );
				
				if (minPagTo > minPag) {
					minPagTo = minPag;
					asMinPag = claveAs;
				}
				
				if (maxPagTo < totalPag) {
					maxPagTo = totalPag;
					asMax = claveAs;
				}
				
				totalPagFe = totalPagFe + totalPag; 
				numAs ++;
				
		}
		promFe = totalPagFe / numAs;	
		System.out.println("Eres el asistente: " ); 
		claveAs = lee.nextInt();
	}		
	System.out.println("En la feria hubo " + numAs + " asistente/s." ); 
	System.out.println("En la feria hubo " + noLec + " asistente/s que no leyeron nada." ); 
	System.out.println("El asistente que leyó más páginas fue el " + asMax); 
	System.out.println("El asistente que leyó el libro con menos páginas fue el " + asMinPag); 
	System.out.println("El promedio de páginas leídas por todos los asistentes en la Feria es  " + promFe); 
	
	}
		
		
}


