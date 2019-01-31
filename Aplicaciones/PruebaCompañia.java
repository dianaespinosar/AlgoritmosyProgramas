package aplicaciones;

import java.util.Scanner;

import generales.Compañia;

public class PruebaCompañia {

	public static void main(String[] args) {
		Compañia c = new Compañia("C");
		Scanner lee = new Scanner(System.in);
		String nomA;
		System.out.println("Da nombre del archivo");
		nomA = lee.nextLine();
		if(c.cargaDatos(nomA)) {
			int mes;
			mes = c.encMesMaxUta(3);
			if (mes > 0)
				System.out.println("Mes con más utilidad en el departamento 3: " + mes);
			else 
				System.out.println("Error");
		}
		else
			System.out.println();
	}

}
