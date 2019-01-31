package aplicaciones;
import java.util.Scanner;

import generales.Cientifico;
public class PruebaCientifico {

	public static void main(String[] args) {
		Scanner lee = new Scanner(System.in);
		String nombre, nombre2, areaEs1, areaEs2;
		System.out.println("Ingrese nombre de las personas: "); //setname
		nombre = lee.nextLine();
		nombre2 = lee.nextLine();
		System.out.println("Ingrese el área de especialidad  de las personas: "); //setcarreer
		areaEs1 = lee.nextLine();
		areaEs2 = lee.nextLine();	
		Cientifico per1 = new Cientifico(nombre, areaEs1);
		Cientifico per2 = new Cientifico(nombre, areaEs2);
		if( per1.equals(per2)) {
			System.out.println("Misma persona ");
		}
		else 
			System.out.println("Personas diferentes");

		
		if (per1.compareTo(per2)  > 0) {
			System.out.println(" El nombre de la primer persona es más largo");
		}
		else if (per1.compareTo(per2) < 0) {
			System.out.println("El nombre de la segunda persona es más largo");
		}	
		else 
			System.out.println("Ambos nombres son igual de largos" );
	}
}