package aplicaciones;

import java.util.Scanner;

import generales.Rectangulo;

public class PruebaRectangulo {

	public static void main(String[] args) {
		
		Scanner lee = new Scanner(System.in);
		Rectangulo mesa = new Rectangulo(4.5,6.3);
		Rectangulo pared = new Rectangulo();
		double base, altura, area;

		System.out.println("\nDame la base ");
		base = lee.nextDouble();
		System.out.println("\nDame la altura ");
		altura = lee.nextDouble();
		pared.setAltura(altura);
		pared.setBase(base);
		area = pared.calA();
		System.out.println("\n¡rea de la pared: " + area);
		
		System.out.println(mesa);
		System.out.println("\n¡rea de la mesa: " + mesa.calA());
		System.out.println("\nPerÌmetro de la mesa: " + mesa.calP());
	}

}
