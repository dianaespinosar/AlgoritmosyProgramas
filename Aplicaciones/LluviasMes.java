package aplicaciones;
import java.util.Scanner;
public class LluviasMes {

	public static void main(String[] args) {
		Scanner lee = new Scanner(System.in); 
		
		int acPrec = 0;
		int max = -1;
		int diaMax = -1;
		int totalMa = 0;
		int cont10 = 0;
		int dia, h,p,d, contMa, contTa;
		System.out.println("Ingrese el d�a ");
		dia = lee.nextInt();
		while (dia != -1) {
			contMa = 0;
			contTa = 0;
			System.out.println("Ingrese la hora ");
			h = lee.nextInt();
			System.out.println("Ingrese la precipitaci�n ");
			p = lee.nextInt();
			System.out.println("Ingrese la duraci�n ");
			d = lee.nextInt();
			
			while (h > 0 && p > 0 && d > 0) {
				acPrec = acPrec + p;
				if (h < 1159) {
					contMa ++;
				}
				else {
					contTa ++;
				}
				
				if (d > max ) {
					max = d;
					diaMax = dia;
				}
				
				System.out.println("Ingrese la hora ");
				h = lee.nextInt();
				System.out.println("Ingrese la precipitaci�n ");
				p = lee.nextInt();
				System.out.println("Ingrese la duraci�n ");
				d = lee.nextInt();
				
			}
			
			if (contMa > contTa ) {
				totalMa++;
			}
			
			if (contMa + contTa >= 10) { 
				cont10++;
			}
			
			System.out.println("Ingrese el d�a ");
			dia = lee.nextInt();
		}
		
		System.out.println("Total de precipitaci�n " + acPrec + "m2"); 
		System.out.println("Hubo " + totalMa + " con menos lluvias en la tarde."); 
		System.out.println("Se present� la lluvia m�s larga el d�a " + diaMax); 
		System.out.println("Hubo " + cont10 +" d�as con m�s de 10 lluvias en el d�a."); 
	}

}
