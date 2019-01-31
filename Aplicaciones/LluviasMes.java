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
		System.out.println("Ingrese el día ");
		dia = lee.nextInt();
		while (dia != -1) {
			contMa = 0;
			contTa = 0;
			System.out.println("Ingrese la hora ");
			h = lee.nextInt();
			System.out.println("Ingrese la precipitación ");
			p = lee.nextInt();
			System.out.println("Ingrese la duración ");
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
				System.out.println("Ingrese la precipitación ");
				p = lee.nextInt();
				System.out.println("Ingrese la duración ");
				d = lee.nextInt();
				
			}
			
			if (contMa > contTa ) {
				totalMa++;
			}
			
			if (contMa + contTa >= 10) { 
				cont10++;
			}
			
			System.out.println("Ingrese el día ");
			dia = lee.nextInt();
		}
		
		System.out.println("Total de precipitación " + acPrec + "m2"); 
		System.out.println("Hubo " + totalMa + " con menos lluvias en la tarde."); 
		System.out.println("Se presentó la lluvia más larga el día " + diaMax); 
		System.out.println("Hubo " + cont10 +" días con más de 10 lluvias en el día."); 
	}

}
