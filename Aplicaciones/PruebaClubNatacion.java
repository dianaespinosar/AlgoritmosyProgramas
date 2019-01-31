package aplicaciones;

import generales.ClubNatacion;

public class PruebaClubNatacion {

	public static void main(String[] args) {
		ClubNatacion club1 = new ClubNatacion();
		
		club1.altaAlberca(2, 30);
		club1.altaAlberca(10, 230);
		club1.altaAlberca(32,123);
		System.out.println("Costo: " + club1.calcCosto(150));

	}

}
