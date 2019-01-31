package aplicaciones;

import java.util.Scanner;

public class MercadoTomates {

	public static void main(String[] args) {
		double p1, p2, p3, p4, tT1, tT2, tT3, tT4;
		int tipo, cant, conPT2, conP20, acT1, acT2, acT3, acT4;
		Scanner lee = new Scanner(System.in);
		
		acT1 = 0;
		acT2 = 0;
		acT3 = 0;
		acT4 = 0;
		conPT2 = 0;
		conP20 = 0;
		System.out.println("\nIngresa precios de jitomates ");
		p1 = lee.nextDouble();
		p2 = lee.nextDouble();
		p3 = lee.nextDouble();
		p4 = lee.nextDouble();
		System.out.println("\nIngresa tipo y cantidad por parcela: ");
		tipo = lee.nextInt();
		cant = lee.nextInt();
		
		while (tipo > 0 && cant > 0) {
			switch (tipo) {
			case 1: acT1 = acT1 + cant;
			break;
			case 2: acT2 = acT2 + cant;
					conPT2 = conPT2 + 1;
			break;
			case 3: acT3 = acT3+ cant;
			break;
			case 4: acT4 = acT4 + cant;
			break;
			}
			if (cant > 20) 
				conP20 = conP20 + 1;
			System.out.println("\nIngresa tipo y cantidad por parcela ");
			tipo = lee.nextInt();
			cant = lee.nextInt();	
 		} //end while
		System.out.println("\nTotal de cajas de jitomate tipo 1: " + acT1);
		System.out.println("\nTotal de cajas de jitomate tipo 2: " + acT2);
		System.out.println("\nTotal de cajas de jitomate tipo 3: " + acT3);
		System.out.println("\nTotal de cajas de jitomate tipo 4: " + acT4);
		System.out.println("\nTotal de parcelas dedicadas al jitomate tipo 2: " + conPT2);
		tT1 = acT1 * p1;
		tT2 = acT2 * p2;
		tT3 = acT3 * p3;
		tT4 = acT4 * p4;
		if (tT1 > tT2 && tT1 > tT3 && tT1 > tT4)
			System.out.println("\nEl tipo 1 dio más $ ");
		else
			if (tT2 > tT1 && tT2 > tT3 && tT2 > tT4) 
				System.out.println("\nEl tipo 2 dio más $ ");
		else
			if (tT3 > tT1 && tT3 > tT2 && tT3 > tT4)
				System.out.println("\nEl tipo 3 dio más $ ");
		else
			if (tT4 > tT1 && tT4 > tT3 && tT4 > tT2)
				System.out.println("\nEl tipo 3 dio más $ ");
		System.out.println("\nTotal de parcelas en las que se cosecharon más de 20 cajas: " + conP20);
 	
	}


}
