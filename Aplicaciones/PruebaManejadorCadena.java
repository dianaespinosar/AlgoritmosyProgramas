package aplicaciones;
import java.util.*;
import generales.ManejadorCadenas;
public class PruebaManejadorCadena {

	public static void main(String[] args) {
		Scanner lee = new Scanner(System.in);
		String frase, palabra, nuePal;
		char car;
		int n;
		System.out.println("Dame una frase");
		frase = lee.nextLine();
		/*
		System.out.println("Dame un caractér");
		car = lee.next().charAt(0);
		System.out.println("Pares e impares: " + ManejadorCadenas.genParImp(frase));
		System.out.println(frase + " tiene el caractér " + car + " " + ManejadorCadenas.cuentaCar(frase, car) + " veces");
		n = frase.indexOf(car);
		System.out.println(n);
		frase = frase.toUpperCase();
		System.out.println(frase);
		System.out.println("Dame una palabra");
		palabra = lee.next();
		System.out.println("Dame nueva palabra");
		nuePal = lee.next();
		System.out.println(ManejadorCadenas.cambiaPalabra(frase, palabra, nuePal));
		*/
		System.out.println(ManejadorCadenas.modificaFrase(frase));
	}
}
