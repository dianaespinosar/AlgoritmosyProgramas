package aplicaciones;

import java.util.Scanner;

import generales.Compa�ia;

public class PruebaCompa�ia {

	public static void main(String[] args) {
		Compa�ia c = new Compa�ia("C");
		Scanner lee = new Scanner(System.in);
		String nomA;
		System.out.println("Da nombre del archivo");
		nomA = lee.nextLine();
		if(c.cargaDatos(nomA)) {
			int mes;
			mes = c.encMesMaxUta(3);
			if (mes > 0)
				System.out.println("Mes con m�s utilidad en el departamento 3: " + mes);
			else 
				System.out.println("Error");
		}
		else
			System.out.println();
	}

}
