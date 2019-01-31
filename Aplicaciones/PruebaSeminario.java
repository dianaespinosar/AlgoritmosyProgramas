package aplicaciones;

import generales.Seminario;

public class PruebaSeminario {

	public static void main(String[] args) {
		Seminario sEt = new Seminario();
		if (sEt.altaAsist("Garza Zuriñe"))
			System.out.println("Sí");
		else
			System.out.println("No");
		if (sEt.altaAsist("Espinosa Diana"))
			System.out.println("Sí");
		else
			System.out.println("No");
		
		if (sEt.altaAsist("Arellano Elena"))
			System.out.println("Sí");
		else
			System.out.println("No");
		
		System.out.println("Lista de los asistentes: \n" + sEt.generaRepoAsist());
		
		if (sEt.asistencia("Espinosa Elisa"))
			System.out.println("Asistió");
		else 
			System.out.println("No asistió");
		
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
