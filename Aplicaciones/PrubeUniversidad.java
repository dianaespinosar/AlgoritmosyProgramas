//Diana Espinosa Ruiz 179164
package aplicaciones;

import generales.Universidad;

public class PrubeUniversidad {

	public static void main(String[] args) {
		Universidad itam = new Universidad("itam");
		itam.altaAlum("Diana Espinosa", "Condominio Galaxia", "EIRD000626MSPSZNA6", "Matem�ticas Aplicadas");
		itam.altaAlum("Zuri�e Garza", "Jardines del Pedregal", "GARZ990626MCMSZNA6", "Ing. Negocios");
		itam.altaAlum("Naomi Rosales" , "Anax�goras","GARZ000702MMPSZNA6", "Direcci�n Financiera");
		itam.altaAlum("Elisa Espinosa", "Cordillera del Marquez", "EIRE000626MSPSZNA6", "Ing. Industrial");
		itam.altaAlum("Fannia P�rez", "Rio Hondo", "PERF000708MSPSZNA6","Administraci�n");
		itam.altaAlum("Aniek Clavel", "Av. Toluca", "CVRA990926MSPSZNA6","Direcci�n Financiera");
		itam.altaAlum("Alumno Ibero", "Lomas de Santa Fe,", "GTRV990912MSPSZNA6","Relaciones Internacionales");
		
		
		System.out.println("Naomi est�: " + itam.buscaAlum("Naomi Rosales"));
		System.out.println("Javier est�: " + itam.buscaAlum("Javier"));
		System.out.println("Se subi� la calificaci�n: " + itam.altaCali("Diana Espinosa", 9));
		System.out.println("Se subi� la calificaci�n: " + itam.altaCali("Diana Espinosa", 9));
		System.out.println("Se subi� la calificaci�n: " + itam.altaCali("Diana Espinosa", 8));
		System.out.println("Se subi� la calificaci�n: " + itam.altaCali("Diana Espinosa", 10));
		System.out.println("Se subi� la calificaci�n: " + itam.altaCali("Javier", 10)); //objetivo regrese false
		System.out.println("Se subi� la calificaci�n: " + itam.altaCali("Aniek Clavel", 9));
		System.out.println("Se subi� la calificaci�n: " + itam.altaCali("Aniek Clavel", 8));
		System.out.println("Se subi� la calificaci�n: " + itam.altaCali("Zuri�e Garza", 10));
		System.out.println("Se cambi� la direcci�n: " + itam.cambiarDomi("Elisa Espinosa", "Condominio Galaxia"));
		System.out.println("Se dio de baja: "  + itam.bajaAlum("Alumno Ibero"));
		System.out.println("Reporte de Diana: " + itam.reporte("Diana Espinosa"));
		System.out.println("Reporte de mayores de 18 a�os: " + itam.reporteMayorEdad(18));
		System.out.println("Carreras y alumnos en ellas: " + "\n" + itam.personasCarreras());
	}

}
