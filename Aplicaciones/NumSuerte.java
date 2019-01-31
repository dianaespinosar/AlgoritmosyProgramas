package aplicaciones;
import java.util.Scanner;
public class NumSuerte {

	public static void main(String[] args) {
		
		Scanner lee = new Scanner(System.in);
		int i;
		int suerte;
		int inte;
		suerte = (int) (Math.random() * 200) - 100;
		System.out.println("Encuentra tú número de la suerte, está entre -100 y 100");
		System.out.println("Tienes 10 intentos");
		for (i = 1; i <= 10; i++) {
			inte = lee.nextInt();
			if (inte < suerte) {
				System.out.println("Número de la suerte es mayor a " + inte);
			} 
			else if (inte > suerte) {
				System.out.println("Número de la suerte es menor a " + inte);
			}

			else {
				System.out.println("Número de la suerte es " + inte);
				System.out.println("Total de intentos: " + i);
				return;
			}
			System.out.println("Llevas " + i + " intento/s");
		}

		System.out.println("Número aleatorio era: " + suerte + " Suerte para la próxima");

	}

}
