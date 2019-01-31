package aplicaciones;

import generales.Seminario;

public class PruebaSeminario {

	public static void main(String[] args) {
		Seminario sEt = new Seminario();
		if (sEt.altaAsist("Garza Zuri�e"))
			System.out.println("S�");
		else
			System.out.println("No");
		if (sEt.altaAsist("Espinosa Diana"))
			System.out.println("S�");
		else
			System.out.println("No");
		
		if (sEt.altaAsist("Arellano Elena"))
			System.out.println("S�");
		else
			System.out.println("No");
		
		System.out.println("Lista de los asistentes: \n" + sEt.generaRepoAsist());
		
		if (sEt.asistencia("Espinosa Elisa"))
			System.out.println("Asisti�");
		else 
			System.out.println("No asisti�");
		
		if (sEt.bajaAsist("Arellano Elena"))
			System.out.println("Dado de baja");
		else
			System.out.println("Error, no encontrado");
		
		if (sEt.bajaAsist("Arellano Elena"))
			System.out.println("Dado de baja");
		else
			System.out.println("Error, no encontrado");
		
		System.out.println("Lista de los asistentes: \n" + sEt.generaRepoAsist());
	}

}
