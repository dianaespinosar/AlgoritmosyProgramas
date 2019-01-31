package aplicaciones;
import java.util.Scanner;

public abstract class Reto3Camiónsurtido {

	public static void main(String[] args) {
		double  precio, surt, maxV, tVen, ven, promV; 
		int i, k, maxD, sinV;
		Scanner lee = new Scanner(System.in); 
		maxV = Integer.MIN_VALUE;
		tVen = 0;
		maxD = 0;
		sinV = 0;
		k = 0;
		
		System.out.println("¿Precio del gas?" ); 
		 precio = lee.nextDouble(); 
		
		for (i = 0; i < 30; i++ ) {
			System.out.println("Surtido" ); 
			surt = lee.nextDouble();
			if (surt == -1) {
				promV = 0;
				sinV ++; 
				System.out.println("Promedio de ventas del día " + i  + " es " + promV); 
			}
			
			else {
				ven = 0;
				while (surt != -1) {
					ven = ven + surt * precio;
					k++;
					surt = lee.nextDouble();
				}
				
				if (ven > maxV) {
					maxV = ven;
					maxD = i;
				}
				promV = (ven / k);
				tVen = tVen + ven;
				System.out.println("Promedio de ventas del día " + i + " es " + promV); 
			}
			
		}
		
		System.out.println("Total $ del mes " + tVen); 
		System.out.println("El día con más litros es " + maxD ); 
		System.out.println("Días sin venta " + sinV); 
		
	}

}
