package aplicaciones;
import java.util.*;

import generales.Persona;
public class PruebaPersona {

	public static void main(String[] args) {
		Scanner lee = new Scanner(System.in);
		
		String curp;
		System.out.println("Ingresa CURP");
		curp = lee.next();
		Persona per1 = new Persona(curp);
		System.out.println("Género: " + per1.genero());
		System.out.println("Edad: " + per1.calEdad(2018));
		System.out.println(per1.nacionalidad());
	}

}
