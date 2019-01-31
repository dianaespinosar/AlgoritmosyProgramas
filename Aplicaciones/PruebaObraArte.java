package aplicaciones;
import generales.ObraArte;
import java.util.Scanner;
import java.util.Scanner;
public class PruebaObraArte {

	public static void main(String[] args) {
		Scanner lee = new Scanner(System.in);
		String nomAutor, nomObra, aMes;
		char tecnica;
		double precioBase, alto, ancho, des;
		int clave;
		
		System.out.println("Nombre de la obra ");
		nomObra = lee.nextLine();
		System.out.println("Nombre del autor de la obra ");
		nomAutor = lee.nextLine();
		System.out.println("Técnica ");
		tecnica = lee.nextLine().charAt(0);
		System.out.println("Precio base ");
		precioBase = lee.nextDouble();
		System.out.println("Ancho de la pintura ");
		ancho = lee.nextDouble();
		System.out.println("Alto de la pintura ");
		alto = lee.nextDouble();
		System.out.println("Clave ");
		clave = lee.nextInt();
		System.out.println("Descuento ");
		des = lee.nextDouble();
		System.out.println("Autor del mes ");
		aMes = lee.nextLine();
		
		
		ObraArte obra= new ObraArte(nomObra, nomAutor, tecnica, precioBase, alto, ancho, clave);
		
		System.out.println("Nombre de la obra ");
		nomObra = lee.nextLine();
		System.out.println("Nombre del autor de la obra ");
		nomAutor = lee.nextLine();
		System.out.println("Técnica ");
		tecnica = lee.nextLine().charAt(0);
		System.out.println("Precio base ");
		precioBase = lee.nextDouble();
		System.out.println("Ancho de la pintura ");
		ancho = lee.nextDouble();
		System.out.println("Alto de la pintura ");
		alto = lee.nextDouble();
		System.out.println("Clave ");
		clave = lee.nextInt();
		System.out.println("Descuento ");
		des = lee.nextDouble();
		System.out.println("Autor del mes ");
		aMes = lee.nextLine();
		
		ObraArte obra2 = new ObraArte(nomObra, nomAutor, tecnica, precioBase, alto, ancho, clave);
		
	
		System.out.println(obra); //toString
		
		if (obra.equals(obra2))
			System.out.println("\n Son iguales");
		else 
			System.out.println("\n No son iguales");
		if (obra.compareTo(obra2) < 0)
			System.out.println(obra.getNomObra() + "es menor que " + obra2.getNomObra());
		else 
			if (obra.compareTo(obra2) > 0)
		System.out.println(obra2.getNomObra() + "es menor que " + obra.getNomObra());
		else
			System.out.println( "Son iguales ");
		System.out.println("Precio a público de " + obra.getNomObra() + " es de  " + obra.calPrecio(aMes, des));
		
	}
}
