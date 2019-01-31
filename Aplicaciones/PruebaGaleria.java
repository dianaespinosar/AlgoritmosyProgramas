package aplicaciones;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import generales.Galeria;
public class PruebaGaleria {
	
	
	public static void main(String[] args) {
		Galeria gal = new Galeria();
		if (gal.altaPint("Diana", "Shine", 'o', 100, 23, 45, 1)) {
			System.out.println("Alta existosa");
		}
		else
			System.out.println("No se pudo");
	}
	
}
