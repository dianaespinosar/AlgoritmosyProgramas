package aplicaciones;

import java.util.Scanner;

import generales.Circulo;

	public class PruebaCirculo {

		public static void main(String[] args) {
			Scanner lee = new Scanner(System.in);
			Circulo disco = new Circulo(4.5);
			Circulo rueda = new Circulo(); 
			double radio, area;

			System.out.print("\nDame el radio: ");
			radio = lee.nextDouble();
			rueda.setRadio(radio);
			area = rueda.calculaArea();
			System.out.println(disco);
			System.out.println("\nArea del disco: " + disco.calculaArea());
			System.out.println("\nPerimetro del disco:" + disco.calculaPerim());
			System.out.println("\nArea de la rueda: " + rueda.calculaArea());
		}

}